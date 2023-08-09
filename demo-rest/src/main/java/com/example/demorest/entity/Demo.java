package com.example.demorest.entity;

public class Demo {
	    public long trainNo;
	    public String trainName;
	    public int islno;
	    public String stationCode;
	    public String stationName;
	    public String arrivaltime;
	    public String departuretime;
	    public int distance;
	    public String sourceStationCode;
	    public String sourceStationName; 
	    public String destinationstationCode; 
	    public String destinationStationName;
		public Demo() {}
		public Demo(long trainNo, String trainName, int islno, String stationCode, String stationName,
				String arrivaltime, String departuretime, int distance, String sourceStationCode,
				String sourceStationName, String destinationstationCode, String destinationStationName) {
			super();
			this.trainNo = trainNo;
			this.trainName = trainName;
			this.islno = islno;
			this.stationCode = stationCode;
			this.stationName = stationName;
			this.arrivaltime = arrivaltime;
			this.departuretime = departuretime;
			this.distance = distance;
			this.sourceStationCode = sourceStationCode;
			this.sourceStationName = sourceStationName;
			this.destinationstationCode = destinationstationCode;
			this.destinationStationName = destinationStationName;
		}
		public long getTrainNo() {
			return trainNo;
		}
		public String getTrainName() {
			return trainName;
		}
		public int getIslno() {
			return islno;
		}
		public String getStationCode() {
			return stationCode;
		}
		public String getStationName() {
			return stationName;
		}
		public String getArrivaltime() {
			return arrivaltime;
		}
		public String getDeparturetime() {
			return departuretime;
		}
		public int getDistance() {
			return distance;
		}
		public String getSourceStationCode() {
			return sourceStationCode;
		}
		public String getSourceStationName() {
			return sourceStationName;
		}
		public String getDestinationstationCode() {
			return destinationstationCode;
		}
		public String getDestinationStationName() {
			return destinationStationName;
		}
		public void setTrainNo(long trainNo) {
			this.trainNo = trainNo;
		}
		public void setTrainName(String trainName) {
			this.trainName = trainName;
		}
		public void setIslno(int islno) {
			this.islno = islno;
		}
		public void setStationCode(String stationCode) {
			this.stationCode = stationCode;
		}
		public void setStationName(String stationName) {
			this.stationName = stationName;
		}
		public void setArrivaltime(String arrivaltime) {
			this.arrivaltime = arrivaltime;
		}
		public void setDeparturetime(String departuretime) {
			this.departuretime = departuretime;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
		public void setSourceStationCode(String sourceStationCode) {
			this.sourceStationCode = sourceStationCode;
		}
		public void setSourceStationName(String sourceStationName) {
			this.sourceStationName = sourceStationName;
		}
		public void setDestinationstationCode(String destinationstationCode) {
			this.destinationstationCode = destinationstationCode;
		}
		public void setDestinationStationName(String destinationStationName) {
			this.destinationStationName = destinationStationName;
		}
		@Override
		public String toString() {
			return "Demo [trainNo=" + trainNo + ", trainName=" + trainName + ", islno=" + islno + ", stationCode="
					+ stationCode + ", stationName=" + stationName + ", arrivaltime=" + arrivaltime + ", departuretime="
					+ departuretime + ", distance=" + distance + ", sourceStationCode=" + sourceStationCode
					+ ", sourceStationName=" + sourceStationName + ", destinationstationCode=" + destinationstationCode
					+ ", destinationStationName=" + destinationStationName + "]";
		}
}
