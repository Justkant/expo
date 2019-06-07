package host.exp.exponent.notifications.presenters;

import android.content.Context;
import android.os.Bundle;

import java.util.Random;

public interface NotificationPresenterInterface {

  default void presentNotification(Context context, String experienceId, Bundle notification) {
    Integer id = Math.abs(new Random().nextInt());
    presentNotification(context, experienceId, notification, id);
  }

  void presentNotification(Context context, String experienceId, Bundle notification, int notificationId);

}
