/* @(#)module-info.java
 * Copyright © 2017 Werner Randelshofer, Switzerland. MIT License.
 */

/**
 * Screen Recorder.
 *
 * @author Werner Randelshofer
 * @version $Id$
 */
module org.monte.media.screenrecorder {
    requires java.desktop;
    requires java.prefs;

    requires org.monte.media;
    requires org.monte.media.swing;

    exports org.monte.media.screenrecorder;
    opens org.monte.media.screenrecorder.images;
}
