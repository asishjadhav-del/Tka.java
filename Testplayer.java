package com.tka.jan15;

public class Testplayer {
public static void main (String[]args) {
	indianplayer [] pbj = new indianplayer[11];
	indianplayer [] Rcb = new indianplayer[11];
	indianplayer [] Mi = new indianplayer[11];
	indianplayer [] Csk = new indianplayer[11];
	
	pbj[0] = new indianplayer (201,7,"Shikar",612,0,"Punjabkings");
	pbj[1] = new indianplayer (202,10,"jonny",666,0,"Punjabkings");
	pbj[2] = new indianplayer (203,25,"livingstone",985,11,"Punjabkings");
	
	pbj[3] = new indianplayer (204,28,"jitesh",854,0,"Punjabkings");
	pbj[4] = new indianplayer (205,18,"samcurren",355,22,"Punjabkings");
	pbj[5] = new indianplayer (206,65,"kagiso",120,112,"Punjabkings");
	
	pbj[6] = new indianplayer (207,3,"Arshadeep",40,125,"Punjabkings");
	pbj[7] = new indianplayer (208,55,"Rahul",85,40,"Punjabkings");
	pbj[8] = new indianplayer (209,58,"Harpreet",95,11,"Punjabkings");
	
	pbj[9] = new indianplayer (210,56,"Nathan",56,15,"Punjabkings");
	pbj[10] = new indianplayer (211,90,"Sharukha",956,2,"Punjabkings");
	
	for(indianplayer s :pbj) {
		if(s.getRun() >1000 && s.getWickets() > 20) {
	System.out.println("Allrounder"+"---->"+s);
	
	}
	else if (s.getRun()  > 1000 && s.getWickets() > 20) {
		System.out.println("Batsman"+"---->"+s);
	}else if(s.getWickets() > 20 ) {
		System.out.println("Bowler"+"---->"+s);
	}
	}
	System.out.println("------------------------.");
	Rcb[0] = new indianplayer (301,18,"Virat",10200,2,"Royalchallengers");
	Rcb[1] = new indianplayer (302,11,"Rajat",1256,0,"PRoyalchallengers");
	Rcb[2] = new indianplayer (303,25,"Salt",925,1,"Royalchallengers");
	
	Rcb[3] = new indianplayer (304,29,"David",1020,0,"Royalchallengers");
	Rcb[4] = new indianplayer (305,12,"Devdatt",2564,0,"Royalchallengers");
	Rcb[5] = new indianplayer (306,101,"Krunal",1856,112,"Royalchallengers");
	
	Rcb[6] = new indianplayer (307,8,"Bhuvneshwar",654,125,"Royalchallengers");
	Rcb[7] = new indianplayer (308,55,"Hazlewood",120,123,"Royalchallengers");
	Rcb[8] = new indianplayer (309,52,"Romario",945,35,"Royalchallengers");
	
	Rcb[9] = new indianplayer (310,65,"Swapnil",123,46,"Royalchallengers");
	Rcb[10] = new indianplayer (311,99,"Yash",99,48,"Royalchallengers");
	
	
	for (indianplayer g : Rcb ) {
		if (g.getRun () > 1000 ) {
			System.out.println("Batsman"+"---->"+g);
		}else if (g.getWickets() > 20) {
			System.out.println("Bowler"+"---->"+g);
		}else {
			System.out.println("Allrounder"+"---->"+g);
		}
	}

	System.out.println("--------------------.");
     Mi[0] = new indianplayer (401,45,"Rohit",11455,12,"Mumbai indians");
	 Mi[1] = new indianplayer (402,63,"Suryakumar",6545,0,"Mumbai indians");
	 Mi[2] = new indianplayer (403,25,"Tilak",2564,1,"Mumbai indians");
	
	Mi[3] = new indianplayer (404,29,"Hardik",3526,98,"Mumbai indians");
	Mi[4] = new indianplayer (405,12,"Quitan",8546,0,"Mumbai indians");
	Mi[5] = new indianplayer (406,101,"Rutharfod",1856,2,"Mumbai indians");
	
	Mi[6] = new indianplayer (407,8,"Trent",654,125,"Mumbai indians");
	Mi[7] = new indianplayer (408,55,"Jasprit",120,156,"Mumbai indians");
	Mi[8] = new indianplayer (409,52,"Santer",945,35,"Mumbai indians");
	
	Mi[9] = new indianplayer (410,65,"Deepak",456,46,"Mumbai indians");
	Mi[10] = new indianplayer (411,99,"Ashwini",99,48,"Mumbai indians");
	
	 
	    for (indianplayer m : Mi ) {
		if (m.getRun () > 1000 ) {
			System.out.println("Batsman"+"---->"+m);
		}else if (m.getWickets() > 20) {
			System.out.println("Bowler"+"---->"+m);
		}else {
			System.out.println("Allrounder"+"---->"+m);
} 
		}

		System.out.println("--------------------.");
		
		Csk[0] = new indianplayer (501,21,"Ruturaj",5464,0,"Chennai Super kings");
		 Csk[1] = new indianplayer (502,28,"Sanju",6985,0,"Chennai Super kings");
		 Csk[2] = new indianplayer (503,22,"Brevis",2554,1,"Chennai Super kings");
		
		Csk[3] = new indianplayer (504,34,"Ayush",1203,0,"Chennai Super kings");
		Csk[4] = new indianplayer (505,88,"Sarfaraj",1123,0,"Chennai Super kings");
		Csk[5] = new indianplayer (506,98,"Shivam",1856,26,"Chennai Super kings");
		
		Csk[6] = new indianplayer (507,14,"Khallel",321,85,"Chennai Super kings");
		Csk[7] = new indianplayer (508,42,"Noor",120,121,"Chennai Super kings");
		Csk[8] = new indianplayer (509,47,"Nathan",123,15,"Chennai Super kings");
		
		Csk[9] = new indianplayer (510,61,"Rahul",456,46,"Chennai Super kings");
		Csk[10] = new indianplayer (511,91,"Shreyas",99,48,"Chennai Super kings");
		
		for (indianplayer n : Csk ) {
			if (n.getRun () > 1000 ) {
				System.out.println("Batsman"+"---->"+n);
			}else if (n.getWickets() > 20) {
				System.out.println("Bowler"+"---->"+n);
			}else {
				System.out.println("Allrounder"+"---->"+n);
	 }
		}
		}
}

