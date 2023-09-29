/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND.objects;

import java.time.LocalDate;

/**
 *
 * @author Kyra Balliram
 */
public class UserDiary {
    private int idDiary;
    private int idUser;
    private int moodRating;
    private String moodFeeling;
    private LocalDate entryDate;
    private String diaryHeading;
    private String diaryContent;

    public UserDiary(int inDiaryID,int inUserID,int inMoodRating,String inMoodFeeling, LocalDate inEntryDate,String inDiaryHeading , String inDiaryContent) {
        idDiary = inDiaryID;
        idUser = inUserID;
        moodRating= inMoodRating;
        moodFeeling = inMoodFeeling;
        entryDate = inEntryDate;
        diaryHeading= inDiaryHeading;
        diaryContent = inDiaryContent;
        
        
        
    }

    public int getIdDiary() {
        return idDiary;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getMoodRating() {
        return moodRating;
    }

    public String getMoodFeeling() {
        return moodFeeling;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public String getDiaryHeading() {
        return diaryHeading;
    }

    public String getDiaryContent() {
        return diaryContent;
    }
    
    
    
    
    
    
}
