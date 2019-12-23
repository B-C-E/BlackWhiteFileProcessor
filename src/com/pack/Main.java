package com.pack;

public class Main {

    public static void main(String[] args) {
	System.out.println("");
	ImageBook book = new ImageBook(256,256);
	book.loadImages(1,20);
	book.saveToTxt("SavedImagesAsText");

	for(int i = 0; i < book.gridList.size(); i++)
    {
        book.gridList.get(i).drawToPNG("file "+ i );
    }

    }
}
