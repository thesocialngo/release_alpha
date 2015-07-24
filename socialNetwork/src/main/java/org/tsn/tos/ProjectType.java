package org.tsn.tos;

public class ProjectType extends BaseTransferObject {

	private static final long	serialVersionUID	= 2590580806418739000L;
		private int id;
		private String description;

		public ProjectType(int projectTypeID, String desc) {

			this.id = projectTypeID;
			this.description = desc;
		}
		public ProjectType(String desc) {

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