package org.tsn.tos;

public class Cause {

		private int id;
		private String description;

		public Cause(int causeID, String desc) {

			this.id = causeID;
			this.description = desc;
		}
		public Cause(String desc) {

			this.description = desc;
		}
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

	}