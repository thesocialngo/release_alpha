package org.tsn.tos;

public class Occupation {

		private int id;
		private String description;

		public Occupation(int occupationID, String desc) {

			this.id = occupationID;
			this.description = desc;
		}
		public Occupation( String desc) {

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