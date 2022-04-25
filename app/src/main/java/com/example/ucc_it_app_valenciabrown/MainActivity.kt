//Author: Valencia Brown
//ID Number: 20183528

package com.example.ucc_it_app_valenciabrown

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initializing the faculty button
        val faculty = findViewById<Button>(R.id.faculty)

        //when the faculty/staff directory button is clicked it should take the user to that screen
        faculty.setOnClickListener{
            val intent = Intent (this, FacultyActivity::class.java)
            startActivity(intent)
        }

        //initializing the timetable button
        val timetable = findViewById<Button>(R.id.timetable)

        //when the timetable button is clicked it should take the user to that screen
        timetable.setOnClickListener{
            val intent = Intent (this, TimetableActivity::class.java)
            startActivity(intent)
        }

        //initializing the admissions button
        val admissions = findViewById<Button>(R.id.admissions)

        //when the admissions button is clicked it should take the user to that screen
        admissions.setOnClickListener{
            val intent = Intent (this, AdmissionsActivity::class.java)
            startActivity(intent)
        }

        //initializing the social media button
        val media = findViewById<Button>(R.id.socialmedia)

        //when the social media button is clicked it should take the user to that screen
        media.setOnClickListener{
            val intent = Intent (this, SocialmediaActivity::class.java)
            startActivity(intent)
        }

        //initializing the Email FAB button
        val email = findViewById<Button>(R.id.email)

        //when the email FAB button is clicked it should take the user to that screen
        email.setOnClickListener{
            val intent = Intent (this, EmailFab::class.java)
            startActivity(intent)
        }

        //initializing the courses button
        val courses = findViewById<Button>(R.id.courses2)

        //when the courses button is clicked it should take the user to that screen
        courses.setOnClickListener{
            val intent = Intent (this, CoursesActivity::class.java)
            startActivity(intent)
        }
    }
}