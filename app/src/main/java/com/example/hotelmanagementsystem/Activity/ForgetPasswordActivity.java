package com.example.hotelmanagementsystem.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.hotelmanagementsystem.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetPasswordActivity extends AppCompatActivity {

    private ImageButton backBtn;
    private EditText emailEt;
    private Button recoverBtn;

    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

//        backBtn = findViewById(R.id.backBtn);
        emailEt = findViewById(R.id.emailEtForget);
        recoverBtn = findViewById(R.id.recoverBtnForget);

        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Please Wait...");
        progressDialog.setCanceledOnTouchOutside(false);


//        backBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onBackPressed();
//            }
//        });

        recoverBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recoverPassword();
            }
        });
    }

    private String email;
    private void recoverPassword() {
        email = emailEt.getText().toString().trim();
        if(Patterns.EMAIL_ADDRESS.matcher("email").matches()){
            Toast.makeText(ForgetPasswordActivity.this, "Invalid Email...", Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("Sending instruction to reset password..");
        progressDialog.show();

        firebaseAuth.sendPasswordResetEmail(email)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        //instructions sent
                        progressDialog.dismiss();
                        Toast.makeText(ForgetPasswordActivity.this, "Password reset instructions sent to your email.. ", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        //failed sending instruction
                        progressDialog.dismiss();
                        Toast.makeText(ForgetPasswordActivity.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

        }
}