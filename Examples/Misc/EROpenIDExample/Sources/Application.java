// Generated by the WOLips Templateengine Plug-in at Apr 22, 2007 10:18:57 AM

import com.webobjects.foundation.NSLog;

import er.extensions.appserver.ERXApplication;

public class Application extends ERXApplication {
  public static void main(String argv[]) {
    ERXApplication.main(argv, Application.class);
  }

  public Application() {
    NSLog.out.appendln("Welcome to " + this.name() + " !");
    /* ** put your initialization code in here ** */
  }
}