/* @(#)BufferedImageWithColorModel.java
 * Copyright © 2017 Werner Randelshofer, Switzerland. Licensed under the MIT License.
 */

package org.monte.media.image;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

/**
 * BufferedImageWithColorModel.
 *
 * @author Werner Randelshofer
 * @version $$Id$$
 */
public class BufferedImageWithColorModel extends BufferedImage {

        private ColorModel colorModel;

        public BufferedImageWithColorModel(ColorModel cm, WritableRaster raster, boolean isRasterPremultiplied) {
            this(cm, raster, isRasterPremultiplied, new  Hashtable<Object,Object> ());
        }

        public BufferedImageWithColorModel(ColorModel cm, WritableRaster raster, boolean isRasterPremultiplied, Hashtable<?, ?> properties) {
            super(cm, raster, isRasterPremultiplied, properties);
            colorModel = cm;
        }

        public BufferedImageWithColorModel(int width, int height, int imageType, IndexColorModel cm) {
            super(width, height, imageType, cm);
            colorModel = cm;
        }

        public BufferedImageWithColorModel(int width, int height, int imageType) {
            super(width, height, imageType);
        }

        @Override
        public ColorModel getColorModel() {
            return colorModel;
        }

        public void setColorModel(ColorModel newValue) {
            this.colorModel = newValue;
        }
    }
