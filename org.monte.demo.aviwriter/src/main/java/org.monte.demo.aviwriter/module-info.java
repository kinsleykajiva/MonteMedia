/* @(#)module-info.java
 * Copyright © 2017 Werner Randelshofer, Switzerland. MIT License.
 */

/**
 * A program that demonstrates how to write AVI files with the Monte Media library.
 *
 * @author Werner Randelshofer
 */
module org.monte.demo.aviwriter {
    requires java.desktop;

    requires org.monte.media;

    exports org.monte.demo.aviwriter;
}
