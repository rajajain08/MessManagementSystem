/**
 * Created by root on 1/12/17.
 */
package rajajain08.annapurnaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Belal on 18/09/16.
 */


public class Menu1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file

        // change R.layout.yourlayoutfilename for each of your fragments

        return inflater.inflate(R.layout.fragment_menu_1, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles

      Home home = (Home)getActivity();
       String name= Home.getMyData();
       String amount = Home.getMyData2();
        String usename=Home.getMyData1();


        TextView tvWelcomeMsg = (TextView) getView().findViewById(R.id.tvWelcomeMsg);
        TextView etUsername = (TextView) getView().findViewById(R.id.etUsername);
          TextView etAge = (TextView) getView().findViewById(R.id.etAge);
        String message = ""  + name + "";
      tvWelcomeMsg.setText(message);
       etUsername.setText(usename);
        etAge.setText(amount);
        getActivity().setTitle("Account Home");




    }
}