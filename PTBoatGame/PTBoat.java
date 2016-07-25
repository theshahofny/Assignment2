package com.tiy.PTBoatGame;

public class PTBoat {
	String row;
	int column;
	
	
	public PTBoat(){
		
	}
	
	public PTBoat(String row){
		this.row = row;
	}
	
	public PTBoat(int column){
		this.column = column;
	}
	
	
	public PTBoat(String row, int column) {
		super();
		this.row = row;
		this.column = column;
	}
	
	public boolean isHit(String row, int column)
    {
        if((this.row.equals(row)) && (this.column == column)){
        return true;
        }
        else {
            return false;
        }
        
    }


}
