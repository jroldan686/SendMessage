package jrl.deint.sendmessage.pojo;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Esta clase POJO gestiona el mensaje de un usuario
 * @author Jesús Roldán López
 * @version 1.0
 */

public class Messages implements Serializable {

    private String message;
    private String user;

    public Messages(String message, String user) {
        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean result;
        if (this == o) return true;
        //if (!(o instanceof Message)) return false;
        if(o == null || getClass() != o.getClass()) return false;

        Messages message1 = (Messages) o;

        /*
        if (!getMessage().equals(message1.getMessage())) return false;
        return getUser().equals(message1.getUser());
        */

        /*
        if(message != null ? !message.equals(message1.message) : message1.message != null)
            return false;
        return user != null ? user.equals(message1.user) : message1.user == null;
        */

        result = message.equals(message1.message) && user.equals(message1.user);
        return result;
    }
}
