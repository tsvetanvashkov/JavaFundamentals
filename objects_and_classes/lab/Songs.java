package objects_and_classes.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
	
	static class Song{
		String typeList;
		public String getTypeList() {
			return typeList;
		}
		public void setTypeList(String typeList) {
			this.typeList = typeList;
		}
		String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		String time;
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfSongs = Integer.parseInt(scan.nextLine());
		List<Song> songList = new ArrayList<Songs.Song>();
		while (numberOfSongs > 0) {
			String[] input = scan.nextLine().split("_");
			
			String type = input[0];
			String name = input[1];
			String time = input[2];
			
			Song songObj = new Song();
			
			songObj.setTypeList(type);
			songObj.setName(name);
			songObj.setTime(time);
			
			songList.add(songObj);
			numberOfSongs--;
		}
		
		String typeSong = scan.nextLine();
		scan.close();
		if (typeSong.equals("all")) {
			for (Song song : songList) {
				System.out.println(song.getName());
			}
		}else {
			for (Song song : songList) {
				if (song.getTypeList().equals(typeSong)) {
					System.out.println(song.getName());
				}
			}
		}

	}

}
