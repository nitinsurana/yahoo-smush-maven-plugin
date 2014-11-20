/*
 * A command line interface to yahoo!'s smush.it lossless image compression utility - http://www.smushit.com/ysmush.it/
 * http://bitbucket.org/abhirama/smushit
 *
 * Copyright 2010, Abhirama
 * http://abhirama.wordpress.com/
 * You can use this software the way you want as long as you keep this notice.
 */
package com.snapwiz;

public class SmushStatsVo {
    protected int totalUploadedImagesCount;
    protected int smushedImagesCount;
    protected int totalUploadedImagesSize;
    protected int totalSmushedImagesSize;

    public int getTotalUploadedImagesCount() {
        return totalUploadedImagesCount;
    }

    public void setTotalUploadedImagesCount(int totalUploadedImagesCount) {
        this.totalUploadedImagesCount = totalUploadedImagesCount;
    }

    public int getSmushedImagesCount() {
        return smushedImagesCount;
    }

    public void setSmushedImagesCount(int smushedImagesCount) {
        this.smushedImagesCount = smushedImagesCount;
    }

    public int getTotalUploadedImagesSize() {
        return totalUploadedImagesSize;
    }

    public void setTotalUploadedImagesSize(int totalUploadedImagesSize) {
        this.totalUploadedImagesSize = totalUploadedImagesSize;
    }

    public int getTotalSmushedImagesSize() {
        return totalSmushedImagesSize;
    }

    public void setTotalSmushedImagesSize(int totalSmushedImagesSize) {
        this.totalSmushedImagesSize = totalSmushedImagesSize;
    }

    public float calculatePercentageSaving() {
        int difference = this.totalUploadedImagesSize - this.totalSmushedImagesSize;
        return ((float) (100 * difference)) / this.totalUploadedImagesSize;
    }

    public String toString() {
        return "Total images uploaded=" + this.totalUploadedImagesCount + ", Total smushed images=" + this.smushedImagesCount
                + ", Total uploaded images size=" + this.totalUploadedImagesSize + ", Total smushed image size=" + this.totalSmushedImagesSize;
    }

}
