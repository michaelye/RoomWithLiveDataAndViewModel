package com.michael.roomwithlivedataandviewmodel;

import android.app.Application;

import com.michael.roomwithlivedataandviewmodel.database.MyDatabase;
import com.michael.roomwithlivedataandviewmodel.database.Student;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class StudentViewModel extends AndroidViewModel
{
    private MyDatabase myDatabase;
    private LiveData<List<Student>> liveDataStudent;

    public StudentViewModel(@NonNull Application application)
    {
        super(application);
        myDatabase = MyDatabase.getInstance(application);
        liveDataStudent = myDatabase.studentDao().getStudentList();
    }

    public LiveData<List<Student>> getLiveDataStudent()
    {
        return liveDataStudent;
    }
}
