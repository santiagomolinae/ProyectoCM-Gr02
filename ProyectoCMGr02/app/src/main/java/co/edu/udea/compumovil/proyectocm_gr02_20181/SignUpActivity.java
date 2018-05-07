package co.edu.udea.compumovil.proyectocm_gr02_20181;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {

    private EditText email ,password;
    private Button login , register;
    private FirebaseAuth mAuth;
    private  FirebaseAuth.AuthStateListener firebaseAuthListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mAuth = FirebaseAuth.getInstance();
        firebaseAuthListener = FirebaseAuth.AuthStateListener(){
                    @Override
                    public void onAuthStateChanged(){

            }
        }

        email = (EditText) findViewById(R.id.txtUserEmail);
        password = (EditText) findViewById(R.id.txtUserPassword);


    }
}
