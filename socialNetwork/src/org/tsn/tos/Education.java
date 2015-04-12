package org.tsn.tos;

public class Education {

		private int id;
		private String description;

		public Education(int educationID, String desc) {

			this.id = educationID;
			this.description = desc;
		}
		public Education( String desc) {

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