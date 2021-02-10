package javabean;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {
		// add();
		// update();
		// delete();
		// select();
		 maritlist();
		// search();
	}

	public static void add() throws Exception {
		Marksheet bean = new Marksheet();
		bean.setSTD_ID(16);
		bean.setROLLNo(116);
		bean.setFname("Vishal");
		bean.setLname("Verma");
		bean.setPHY(45);
		bean.setCHE(55);
		bean.setMATHS(35);
		MarksheetModel model = new MarksheetModel();
		model.add(bean);
	}

	public static void update() throws Exception {
		Marksheet m1 = new Marksheet();
		m1.setROLLNo(102);
		m1.setFname("ABHISHEK");
		m1.setLname("DASHONDHI");
		m1.setPHY(68);
		m1.setCHE(78);
		m1.setMATHS(88);
		m1.setSTD_ID(2);
		MarksheetModel model = new MarksheetModel();
		model.update(m1);
	}

	public static void delete() throws Exception {
		Marksheet m2 = new Marksheet();
		m2.setSTD_ID(16);
		MarksheetModel model = new MarksheetModel();
		model.delete(m2);
	}

	public static void select() throws Exception {
		Marksheet m3 = new Marksheet();
		MarksheetModel model = new MarksheetModel();
		model.select(m3);
	}

	public static void maritlist() throws Exception {
		Marksheet m4 = new Marksheet();
		MarksheetModel model = new MarksheetModel();
		((MarksheetModel) model).maritlist(m4);
	}

	public static void search() throws Exception {
		Marksheet m5 = new Marksheet();
		m5.setROLLNo(105);
		MarksheetModel model = new MarksheetModel();
		model.search(m5);
	}
}
