package com.example.parseogren;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // database database database
        //parse e nasıl veri yazılır nasıl veriçekilir

        //parse da yeni obje oluşturma//internet üzerinden veri kaydetme
/*
        ParseObject object = new ParseObject("Meyveler");
/*
        object.put("name","elma");
        object.put("kalori",100);

        object.put("name","muz");
        object.put("kalori",50);
        object.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                //islem bitince hata=e

                if(e!=null){
                    //eger hata varsa
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Meyve Kaydedildi",Toast.LENGTH_LONG).show();
                }
            }
        });
*/

//server dan okuma
         //tek obje çekme
        /*
        ParseQuery<ParseObject> query = ParseQuery.getQuery("Meyveler");
        query.getInBackground("Buraya Meyveler tablosuna ait parse sitesindeki kod yazılacak", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if(e!=null){
                    e.printStackTrace();
                }else {
                    String objecktName = object.getString("name");
                    int objecktCal = object.getInt("kalori");

                    System.out.println("object name"+objecktName);
                    System.out.println("object kalaroi"+objecktCal);
                }
            }
        });*/

        //server dan tüm objeleri çekme
      /*  ParseQuery<ParseObject> query = ParseQuery.getQuery("Meyveler");
        //sadece muz çekmek istesek // query.whereEquelTo("name","muz")//sql sorguları
        // kalorisi 70 den büyük //query.whereLessThan("kalori",70)
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if(e!=null){
                    e.printStackTrace();
                }else{
                    if(objects.size()> 0){
                        for (ParseObject object : objects){
                            String objecktName = object.getString("name");
                            int objecktCal = object.getInt("kalori");

                            System.out.println("object name: "+objecktName);
                            System.out.println("object kalaroi: "+objecktCal);
                        }
                    }
                }
            }
        });*/
     //-------------------------------------------------------------------------------------------------//
      //user user user user islemleri
/*
        //user olusturma
        ParseUser  user = new ParseUser();
        user.setUsername("Kullanıcı adı");
        user.setPassword("Şifre");

        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if(e!=null){
                    e.printStackTrace();
                } else{
                    Toast.makeText(getApplicationContext(),"Kullanıcı Olustu",Toast.LENGTH_LONG).show();
                }
            }
        });*/

//kullanıcı ile giris yapma
/*
        ParseUser.logInInBackground("Kullanıcı adı", "Şifre", new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {

                if(e!=null){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Hoşgeldin  "+ user.getUsername(),Toast.LENGTH_LONG).show();
                }
            }
        });
*/


    }
}
