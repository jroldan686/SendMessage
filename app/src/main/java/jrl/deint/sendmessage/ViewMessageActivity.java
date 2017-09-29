package jrl.deint.sendmessage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Esta clase recibe un mensaje de un usuario y se muestra en pantalla.
 * @author Jesús Roldán López
 * @version 1.0
 */
public class ViewMessageActivity extends AppCompatActivity {

    private TextView txvViewMessage;
    private TextView txvViewUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);

        txvViewMessage = (TextView)findViewById(R.id.txvViewMessage);
        txvViewUser = (TextView)findViewById(R.id.txvViewUser);

        //1. Recoger el Intent que se ha enviado
        //Intent intent = getIntent();
        //2. Recoger el mensaje del Bundle
        //Bundle bundle = intent.getExtras();
        //3. Mostrar mensaje
        //txvViewMessage.setText(bundle.getString("message"));
        txvViewMessage.setText(getIntent().getExtras().getString("message"));
        String viewUser = String.format(getResources().getString(R.string.txvViewUser),
                getIntent().getExtras().getString("user"));
        txvViewUser.setText(viewUser);
    }
}
