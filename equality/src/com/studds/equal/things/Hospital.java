package com.studds.equal.things;

public class Hospital {
	
		private String name;
		private String type;
		private double charges;
		private int totalStaffs;
		private char hospitalCode;
		private String mdName;
		private String location;
		private long totalRevenue;
		private boolean good;
		private int totalBranches;

		public Hospital() {
			System.out.println("default constructor of the currency");
		}

		public Hospital(String name, String type, double charges, int totalStaffs, char hospitalCode, String mdName,
				String location, long totalRevenue, boolean good, int totalBranches) {
			super();
			this.name = name;
			this.type = type;
			this.charges = charges;
			this.totalStaffs = totalStaffs;
			this.hospitalCode = hospitalCode;
			this.mdName = mdName;
			this.location = location;
			this.totalRevenue = totalRevenue;
			this.good = good;
			this.totalBranches = totalBranches;
		}

		@Override
		public String toString() {
			return "Hospital [name=" + name + ", type=" + type + ", charges=" + charges + ", totalStaffs=" + totalStaffs
					+ ", hospitalCode=" + hospitalCode + ", mdName=" + mdName + ", location=" + location + ", totalRevenue="
					+ totalRevenue + ", good=" + good + ", totalBranches=" + totalBranches + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Hospital) { 
				System.out.println("this both are diffrent");
				Hospital casted= (Hospital) obj; 
				if (this.name.equals(casted.name) && this.location.equals(casted.location)
						&& this.mdName.equals(casted.mdName) && this.type.equals(casted.type)) {
					System.out.println("location ,md name,type and name  are same");
					return true;
				} else {
					System.err.println("location ,md name,type and name  are not same ");
					return false;
				}
			} else {
				System.err.println("obj is not a instance of hospital");
			}

			return super.equals(obj);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public double getCharges() {
			return charges;
		}

		public void setCharges(double charges) {
			this.charges = charges;
		}

		public int getTotalStaffs() {
			return totalStaffs;
		}

		public void setTotalStaffs(int totalStaffs) {
			this.totalStaffs = totalStaffs;
		}

		public char getHospitalCode() {
			return hospitalCode;
		}

		public void setHospitalCode(char hospitalCode) {
			this.hospitalCode = hospitalCode;
		}

		public String getMdName() {
			return mdName;
		}

		public void setMdName(String mdName) {
			this.mdName = mdName;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public long getTotalRevenue() {
			return totalRevenue;
		}

		public void setTotalRevenue(long totalRevenue) {
			this.totalRevenue = totalRevenue;
		}

		public boolean isGood() {
			return good;
		}

		public void setGood(boolean good) {
			this.good = good;
		}

		public int getTotalBranches() {
			return totalBranches;
		}

		public void setTotalBranches(int totalBranches) {
			this.totalBranches = totalBranches;
		}

	}


