package com.studds.equal.things;

public class Institution {
	
		private String name;
		private String type;
		private long fees;
		private int totalStaffs;
		private char Code;
		private String principalName;
		private String location;
		private long totalRevenue;
		private boolean good;
		private int totalBranches;

		public Institution() {
			System.out.println("default constructor of the God");
		}

		public Institution(String name, String type, long fees, int totalStaffs, char code, String principalName,
				String location, long totalRevenue, boolean good, int totalBranches) {
			super();
			this.name = name;
			this.type = type;
			this.fees = fees;
			this.totalStaffs = totalStaffs;
			Code = code;
			this.principalName = principalName;
			this.location = location;
			this.totalRevenue = totalRevenue;
			this.good = good;
			this.totalBranches = totalBranches;
		}

		@Override
		public String toString() {
			return "Institution [name=" + name + ", type=" + type + ", fees=" + fees + ", totalStaffs=" + totalStaffs
					+ ", Code=" + Code + ", principalName=" + principalName + ", location=" + location + ", totalRevenue="
					+ totalRevenue + ", good=" + good + ", totalBranches=" + totalBranches + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Institution) {
				Institution institution3=(Institution)obj;
				System.out.println("obj is instance of institution");
				if (this.principalName.equals(institution3.principalName) && this.type.equals(institution3.type) ) {
					System.out.println("type and principal name  are same");
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

		public long getFees() {
			return fees;
		}

		public void setFees(long fees) {
			this.fees = fees;
		}

		public int getTotalStaffs() {
			return totalStaffs;
		}

		public void setTotalStaffs(int totalStaffs) {
			this.totalStaffs = totalStaffs;
		}

		public char getCode() {
			return Code;
		}

		public void setCode(char code) {
			Code = code;
		}

		public String getPrincipalName() {
			return principalName;
		}

		public void setPrincipalName(String principalName) {
			this.principalName = principalName;
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
