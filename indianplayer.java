package com.tka.jan15;

public class indianplayer {
	private int p_id;
	private int j_nom;
	private String p_name;
	private int run;
	private int wickets;
	private String t_name;
	
	public indianplayer(int p_id,int j_nom,String p_name,int run,int wicket,String t_name) {
		this.p_id =p_id;
		this.j_nom =j_nom;
		this.p_name =p_name;
		this.run =run;
		this.wickets =wicket;
		this.t_name =t_name;
		
	}
public int getP_id() {
	return p_id;	
	}
public void setP_id(int p_id) {
	this.p_id =p_id;
}
public int getJ_nom() {
	return j_nom;
	}
public void setJ_nom(int j_nom) {
	this.j_nom =j_nom;
}
public String getP_name() {
	return p_name;
}
public void setP_name (String p_name) {
	this.p_name =p_name;
}
public int getRun() {
	return run;
}
public void setRun(int run) {
	this.run = run;
}

public int getWickets() {
	return wickets = wickets;
	
}
public void setwickets(int wickets) {
	this.wickets =wickets;
}
public String getT_name() {
	return t_name;
	
}
public void setT_name(String t_name) {
	this.t_name = t_name;
	
}
@Override
public String toString() {
	return "indianplayer [p_id=" + p_id + ", j_nom=" + j_nom + ", p_name=" + p_name + ", run=" + run + ", wickets="
			+ wickets + ", t_name=" + t_name + "]";
}
}



