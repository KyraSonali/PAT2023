/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND.managers;

import BACKEND.DB;
import BACKEND.objects.UserDiary;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyra Balliram
 */
public class DiaryManager {

    private UserDiary[] diaryArr = new UserDiary[365];
    int size;

    public DiaryManager() {
        size = 0;
        String query = "SELECT * FROM kyrabDB.diary";
        try {
            ResultSet diary = DB.query(query);
            while (diary.next()) {
                int idDiary = diary.getInt("idDiary");
                int idUser = diary.getInt("idUser");
                int moodRating = diary.getInt("moodRating");
                String moodFeeling = diary.getString("moodFeeling");
                String entryDate = diary.getString("entryDate");
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate startDate = LocalDate.parse(entryDate, dtf);
                String diaryHeading = diary.getString("diaryHeading");
                String diaryContent = diary.getString("diaryContent");

                diaryArr[size] = new UserDiary(idDiary, idUser, moodRating, moodFeeling, startDate, diaryHeading, diaryContent);
                size++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(DiaryManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addDiaryEntry(int inUserID, int inMoodRating, String inMoodFeeling, LocalDate inEntryDate, String inDiaryHeading, String inDiaryContent) throws SQLException {
        String query = "INSERT INTO kyrabDB.diary ( idUser, moodRating, moodFeeling, entryDate, diaryHeading,diaryContent) VALUES ('" + inUserID + "','" + inMoodRating + "','" + inMoodFeeling + "','" + inEntryDate + "','" + inDiaryHeading + "','" + inDiaryContent + "');";
        System.out.println(query);
        DB.update(query);

        //retreieve id for diary entry
        String getIdquery = "SELECT idDiary\n" + "FROM kyrabDB.diary\n" + "WHERE idUser ='" + inUserID + "'" + ";";
        //move to next line
        ResultSet IDquery = DB.query(getIdquery);
        IDquery.next();
        int diaryID = IDquery.getInt(1);

        diaryArr[size] = new UserDiary(diaryID, inUserID, inMoodRating, inMoodFeeling, inEntryDate, inDiaryHeading, inDiaryContent);
        size++;

    }

    public ArrayList<String> getdiaryEntries(int idUser, String entryDate) throws SQLException {
        ArrayList<String> list = new ArrayList<>();
        String getDiaryHeading = "SELECT diaryHeading,diaryContent\n"
                + "FROM kyrabDB.diary\n"
                + "WHERE idUser =" + idUser + "\n"
                + "AND entryDate= '" + entryDate + "'" + ";";
        ResultSet diaryHeadingQuery = DB.query(getDiaryHeading);

        String output = "";
        while (diaryHeadingQuery.next()) {
            output = diaryHeadingQuery.getString("diaryHeading") + "\n";
            output += diaryHeadingQuery.getString("diaryContent") + "\n";
            list.add(output);
        }

        return list;
    }



   public ArrayList<Integer> getMoodRatings(int idUser, String entryDate) throws SQLException {
        String getRatingQuery = "SELECT moodRating\n"
                + "FROM kyrabDB.diary\n"
                + "WHERE idUser =" + idUser + "\n"
                + "AND entryDate= '" + entryDate + "'" + ";";

        ResultSet moodRatings = DB.query(getRatingQuery);
        
        ArrayList<Integer> ratings = new ArrayList<>();
        while (moodRatings.next()) {
            int rating = moodRatings.getInt("moodRating");
            ratings.add(rating);
        }
        
        return ratings;
    }


    public ArrayList<String> getFeeling(int idUser, String entryDate) throws SQLException {
        ArrayList<String> list = new ArrayList<>();
        String getFeelingQuery = "SELECT moodFeeling\n"
                + "FROM kyrabDB.diary\n"
                + "WHERE idUser =" + idUser + "\n"
                + "AND entryDate= '" + entryDate + "'" + ";";
        ResultSet moodFeeling = DB.query(getFeelingQuery);

        while (moodFeeling.next()) {
            String feeling = moodFeeling.getString("moodFeeling") + ",";
            list.add(feeling);
        }
        return list;

    }

}
