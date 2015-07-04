package org.tsn.tos;

public class Education extends BaseTransferObject{

	private static final long	serialVersionUID	= 2863918022347037482L;
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