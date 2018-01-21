	/*
	 * Program: Fully Functional Administration Tool
	 * By: Joshua Abraham
	 * Started: April 9, 2016
	 * Finished: June 12, 2016
	 * Version: 5.2
	 * Lines:1486
	 */
package Work;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
	//================================================================================================
	
	public class Work implements ActionListener, MouseListener {
		{
			try {
				UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
			} catch (Exception e) {
				e.printStackTrace();
			}}
		static Work call = new Work();
		// Main Frame
		JFrame MainFrame1 = new JFrame("Main");
		JPanel MainPanel = new JPanel();
		JButton StudentButton = new JButton("Student");
		JButton TeacherButton = new JButton("Teacher");
		JButton AdminButton = new JButton("Administration");
		JButton UserManual=new JButton("User Manual");
		// Back button
		JButton back = new JButton("<");
		JButton back2 = new JButton("<");
		JButton back3 = new JButton("<");
		JButton back4 = new JButton("<");
		JButton back5 = new JButton("<");
		JButton back6 = new JButton("<");
		JButton back7 = new JButton("<");
		// Administration Frame
		JFrame AdminFrame1 = new JFrame("Administration");
		JPanel MainPanel2 = new JPanel();
		JButton NewStudent = new JButton("Add new student");
		JTextField SearchBar = new JTextField("Search...");
		// JComboBox StudentList = new JComboBox();
		ArrayList<String> names = new ArrayList<String>();
		// New Student Admin frame
		JFrame AddStudent1 = new JFrame("Add New Student");
		JPanel NewStudentPanel = new JPanel();
		JTextField Studentname = new JTextField("Student Name");
		JTextField Studenthours = new JTextField("Volunteer Hours");
		JButton Add = new JButton("Add");
		JTextField StudentNum = new JTextField("Student Number");
		JLabel worklabel = new JLabel();
		JButton search = new JButton("Search");
		JLabel FAILURE = new JLabel();
		Dimension dimension = new Dimension(220, 30);
		JButton update = new JButton("Update");
		String a1, a2, a3;
		JTextField studentnumbers = new JTextField();
		JTextField studentnames = new JTextField();
		JTextField volunhours = new JTextField();
		JLabel label1 = new JLabel("Student Number");
		JLabel label2 = new JLabel("Student Name");
		JTextArea text = new JTextArea(12, 20);
		JFrame studentinfo = new JFrame();
		JPanel blank = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		// Adding Courses Frame
		JFrame CoursesFrame = new JFrame();
		JLabel Label1 = new JLabel("Available Courses");
		JLabel Label2 = new JLabel("Students Courses");
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel35=new JPanel();
		String[] courselist = new String[30];
		String[] StudentCourseList = new String[8];
		JList list = new JList(courselist); // data has type Object[]
		JList list2 = new JList(StudentCourseList);
		JButton Save = new JButton("Save Changes");
		// Confirmation Window
		JFrame Confirmation = new JFrame();
		JPanel Panel8 = new JPanel();
		JLabel text2 = new JLabel("Are you sure you wish to save?");
		JLabel text3 = new JLabel(" These changes cannot be undone!");
		JButton Yes = new JButton("Confirm Save");
		JButton No = new JButton("Cancel");
		// Teacher Frame 1
		JFrame teacherFrame = new JFrame("Teacher");
		JPanel panel10 = new JPanel();
		JTextField SearchBar3 = new JTextField("Enter Course Code");
		JButton search3 = new JButton("Enter");
		// Teacher Frame 2
		JFrame teacherFrame2 = new JFrame();
		JPanel panel11 = new JPanel();
		JPanel panel12 = new JPanel();
		JPanel panel13 = new JPanel();
		String[] Students = new String[35];
		JComboBox ClassList = new JComboBox();
		JComboBox CourseList = new JComboBox();
		JLabel label4 = new JLabel("Please Select a Student");
		// Teacher Frame 3
		String selectedStudent = new String();
		JFrame TeacherFrame3 = new JFrame();
		JLabel label6a = new JLabel("     Name          Mark          Weighting		");
		JLabel label6b = new JLabel("     Name          Mark          Weighting		");
		JLabel label6c = new JLabel("     Name          Mark          Weighting		");
		JLabel label6d = new JLabel("     Name          Mark          Weighting		");
		JLabel label6e = new JLabel("	  Name          Mark          Weighting");
		JLabel label5 = new JLabel("<html><div style=\"text-align: center;\">" + "Knowledge and Understanding" + "</html>");
		JLabel label9 = new JLabel("<html><div style=\"text-align: center;\">" + "Thinking and Inquiry" + "</html>");
		JLabel label10 = new JLabel("<html><div style=\"text-align: center;\">" + "Application" + "</html>");
		JLabel label11 = new JLabel("<html><div style=\"text-align: center;\">" + "Communication" + "</html>");
		JLabel label12 = new JLabel("<html><div style=\"text-align: center;\">" + "Final Culminating" + "</html>");
		JPanel panel8 = new JPanel();
		JPanel panel14 = new JPanel();
		JPanel panel15 = new JPanel();
		JPanel panel16 = new JPanel();
		JPanel panel20 = new JPanel();
		// Adding/Removing Marks
		JFrame MarkFrame = new JFrame();
		JPanel panel17 = new JPanel();
		JPanel panel18 = new JPanel();
		JTextField Categories = new JTextField("Category");
		JButton AddMark = new JButton("Add Mark");
		JButton Attendance2 = new JButton("Attendance");
		JButton back8 = new JButton("<");
		JFrame AddFrame = new JFrame();
		JTextField AssignName = new JTextField("Assignment Name");
		JTextField Percentage = new JTextField("Percentage");
		JTextField MarkWeighting = new JTextField("Weighting");
		JButton Enter = new JButton("Enter");
		JButton back9 = new JButton("<");
		JFrame RemoveFrame = new JFrame();
		JPanel panel19 = new JPanel();
		// Student Frame
		JFrame Studentframe = new JFrame();
		JPanel StudentPanel1 = new JPanel();
		JTextField SearchBar2 = new JTextField("Enter Student Number");
		JButton search2 = new JButton("Enter");
		// Student Frame 2
		JFrame Studentframe2 = new JFrame();
		JPanel StudentPanel2 = new JPanel();
		JButton CourseSelect = new JButton("Choose Courses");
		JButton Marks = new JButton("Current Marks");
		JButton AttendanceB = new JButton("Attendance");
		int checker = 0, checker3 = 0;
		boolean checker7 = true;
		// Student Marks Frame 1
		String selectedClass = new String();
		JFrame StudentMarksFrame1 = new JFrame("Marks");
		JPanel panel9 = new JPanel();
		JTable table1 = new JTable();
		JPanel panel21 = new JPanel();
		int checker2 = 0, checker4 = 0;
		JPanel panel26 = new JPanel();
		// Arrays
		String[] Knowledge = new String[50];
		String[] Thinking = new String[50];
		String[] Application = new String[50];
		String[] Communication = new String[50];
		String[] Exam = new String[6];
		JButton back10 = new JButton("<");
		boolean backaroo = false, checker6 = true;
		// Attendance
		int present = 0, late = 0, excused = 0, absent = 0;
		JFrame AttendanceFrame = new JFrame("Attendance");
		JTextArea AttendanceText = new JTextArea(4, 1);
		JPanel panel25 = new JPanel();
		JPanel panel27 = new JPanel();
		boolean Attendancer = false;
		JTextField AttendanceT = new JTextField("P/L/E/A");
		String tracker = new String();
		JButton AttendanceEnter = new JButton("Enter");
		// Transcript Frame
		JFrame transcript = new JFrame();
		JPanel transcriptp = new JPanel();
		JButton transcriptb = new JButton("View Transcript");
		JTextArea transcriptA = new JTextArea(32, 20);
		JButton transcriptupdate = new JButton("Update");
		JButton back51 = new JButton("<");
		// =================================================================================================
		// =================================================================================================
		public static void main(String[] args) {
			
			call.chooseFile();
		}
		Work() {
	
			// Main Frame
			StudentButton.addActionListener(this);
			TeacherButton.addActionListener(this);
			AdminButton.addActionListener(this);
			UserManual.addActionListener(this);
			StudentButton.setPreferredSize(new Dimension(120, 45));
			TeacherButton.setPreferredSize(new Dimension(120, 45));
			AdminButton.setPreferredSize(new Dimension(120, 45));
			UserManual.setPreferredSize(new Dimension(120, 45));
			MainFrame1.setSize(180, 250);
			MainPanel.add(StudentButton);
			MainPanel.add(TeacherButton);
			MainPanel.add(AdminButton);
			MainPanel.add(UserManual);
			MainFrame1.add(MainPanel);
			MainFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			MainFrame1.setResizable(false);
			MainFrame1.setLocationRelativeTo(null);
			MainFrame1.setVisible(true);
			AddStudent1.setVisible(false);
			update.addActionListener(this);
			back3.addActionListener(this);
			transcriptupdate.addActionListener(this);
			back51.addActionListener(this);
		}
	
		
		private void chooseFile() {
			File files = new File("Schools\\");
			String[] names = files.list();
			try {
				for (String name : names) {
					if (new File("Schools\\" + name + ".hi").isDirectory()) {
						if (name.equals("Available Classes")) {
	
						}
					} else {
					}
				}
			} catch (Exception e) {
			}
		}
		// =========================================================================================================
		// Mouse Listener for All TextFields
		public void mouseClicked(MouseEvent e) {
			Object b = e.getSource();
			if (b == SearchBar) {
				if (SearchBar.getText().equals("Search...")) {
					SearchBar.setText("");
				}
			}
			if (b == SearchBar2) {
				if (SearchBar2.getText().equals("Enter Student Number")
						|| SearchBar2.getText().equals("Student does not exist.")) {
					SearchBar2.setText("");
				}
			}
			if (b == SearchBar3) {
				if (SearchBar3.getText().equals("Enter Course Code")
						|| SearchBar3.getText().equals("Course does not exist.")) {
					SearchBar3.setText("");
					checker2 = 0;
				}
			}
			if (b == Studentname) {
				if (Studentname.getText().equals("Student Name")) {
					Studentname.setText("");
				}
			}
			if (b == StudentNum) {
				if (StudentNum.getText().equals("Student Number")) {
					StudentNum.setText("");
				}
			}
			if (b == AssignName) {
				AssignName.setText("");
			}
			if (b == MarkWeighting) {
				MarkWeighting.setText("");
			}
			if (b == Percentage) {
				Percentage.setText("");
			}
			if (b == Categories) {
				Categories.setText("");
			}
			if (b == AttendanceT) {
				AttendanceT.setText("");
			}
		}
		// Action Listener For All Buttons
		@SuppressWarnings("resource")
		public void actionPerformed(ActionEvent e) {
			Object a = e.getSource();
			if (a==UserManual){
				//Opens up user manual as a PDF file
				File file = new File("Schools\\UserManual.pdf");
			    if (file.toString().endsWith(".pdf"))
					try {
						Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				else {
			        Desktop desktop = Desktop.getDesktop();
			        try {
						desktop.open(file);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
			}
			if(a==back51){
				transcript.setVisible(false);
				studentinfo.setVisible(true);
			}
			if (a == transcriptupdate) {
				Transcriptedit();
			}
			if (a == StudentButton) {
				Attendancer = false;
				call.StudentStuff();
			}
			if (a == TeacherButton) {
				Attendancer = true;
				call.TeacherStuff();
			}
			if (a == AdminButton) {
				call.AdminStuff();
			}
			if (a == SearchBar) {
			}
			if (a == search2) {
				File directory = new File("Schools\\" + SearchBar2.getText()
						+ ".hi");
				if (!directory.exists()) {
					SearchBar2.setText("Student does not exist.");
				} else if (SearchBar2.getText().equals("")) {
					SearchBar2.setText("Student does not exist.");
				} else {
					call.StudentStuff2();
				}
			}
			if (a == search) {
				call.Studentinfo();
			}
			if (a == NewStudent) {
				call.AddStudent();
			}
			if (a == Add) {
				call.Add();
				StudentNum.setText("Student Number");
				Studentname.setText("Student Name");
			}
			if (a == back) {
				MainFrame1.setVisible(true);
				AdminFrame1.setVisible(false);
				Studentframe.setVisible(false);
				teacherFrame.setVisible(false);
			}
			if (a == back2) {
				AdminFrame1.setVisible(true);
				names.clear();
				call.chooseFile();
				Studentname.setText("Student Name");
				StudentNum.setText("Student Number");
				AddStudent1.setVisible(false);
			}
			if (a == update) {
				String updater = text.getText();
				String names2 = SearchBar.getText();
				try {
					PrintWriter out;
					out = new PrintWriter(new FileWriter("Schools\\" + names2
							+ ".hi" + "\\" + "Student Information.txt", false));
					out.print(updater);
					out.close();
				} catch (Exception e1) {
	
					e1.printStackTrace();
				}
			}
			if (a == back3) {
				studentinfo.setVisible(false);
				SearchBar.setText("Search...");
				text.setText("");
				call.AdminStuff();
			}
			if (a == back4) {
				Studentframe2.setVisible(false);
				AttendanceFrame.setVisible(false);
				SearchBar2.setText("Enter Student Number");
				call.StudentStuff();
			}
			if (a == back6) {
				CoursesFrame.setVisible(false);
				StudentStuff2();
			}
			if (a == CourseSelect) {
				if (checker == 0) {
					Courses();
				} else {
					CoursesFrame.setVisible(true);
				}
			}
			if (a == Save) {
				call.Confirm();
			}
			if (a == Yes) {
				try {
					File file = new File("Schools\\" + SearchBar2.getText() + ".hi"
							+ "\\Current Classes");
					if (!file.exists()) {
						if (file.mkdir()) {
						} else {
						}
					}
					int x = 0;
					while (StudentCourseList[x] != null) {
						PrintWriter out = new PrintWriter(new FileWriter(file
								+ "\\" + StudentCourseList[x] + ".txt", true));
						out = new PrintWriter(new FileWriter(file + "\\"
								+ StudentCourseList[x] + "_Attendance.txt", true));
						out.close();
						x++;
					}
				} catch (Exception e2) {
				}
				Confirmation.setVisible(false);
				CoursesFrame.setVisible(false);
				Studentframe2.setVisible(false);
				StudentStuff();
			}
			if (a == No) {
				Confirmation.setVisible(false);
			}
			if (a == Marks) {
				CurrentMarks();
			}
			if (a == TeacherButton) {
				TeacherStuff();
			}
			if (a == search3) {
				if (checker2 == 0) {
					File directory = new File("Schools\\Available Classes\\"
							+ SearchBar3.getText() + ".txt");
					if (!directory.exists()) {
						SearchBar3.setText("Course does not exist.");
					} else if (directory.exists()) {
						TeacherStuff2();
					}
					checker2 = 1;
				}
			}
			if (a == back7) {
				SearchBar3.setText("Enter Course Code");
				teacherFrame2.setVisible(false);
				TeacherStuff();
				checker3 = 1;
				checker2 = 0;
			}
			if (a == ClassList) {
	
				backaroo = false;
				teacherFrame2.setVisible(false);
				selectedStudent = ClassList.getSelectedItem().toString();
				TeacherStuff3();
				TeacherStuff4();
				AddingMarks();
			}
			if (a == CourseList) {
				back10.addActionListener(this);
				backaroo = true;
				StudentMarksFrame1.setVisible(false);
				selectedClass = CourseList.getSelectedItem().toString();
				SearchBar3.setText(selectedClass);
				selectedStudent = SearchBar2.getText();
				TeacherStuff3();
				TeacherStuff4();
				Attendance();
			}
			if (a == back8) {
				TeacherFrame3.setVisible(false);
				MarkFrame.setVisible(false);
				AttendanceFrame.setVisible(false);
				AddFrame.setVisible(false);
				teacherFrame2.setVisible(true);
			}
			if (a == AddMark) {
				AttendanceFrame.setVisible(false);
				AddingMarks2();
			}
			if (a == Enter) {
				String input = new String();
				try {
					double percent = Double.parseDouble(Percentage.getText());
					int worth = Integer.parseInt(MarkWeighting.getText());
					if (Categories.getText().contains("K")
							&& AssignName.getText() != null && percent >= 0
							&& worth != 0) {
						input = "K/U," + AssignName.getText() + "," + percent + ","
								+ worth;
					} else if (Categories.getText().contains("T")
							&& AssignName.getText() != null && percent >= 0
							&& worth != 0) {
						input = "T/I," + AssignName.getText() + "," + percent + ","
								+ worth;
					} else if (Categories.getText().contains("A")
							&& AssignName.getText() != null && percent >= 0
							&& worth != 0) {
						input = "App," + AssignName.getText() + "," + percent + ","
								+ worth;
					} else if (Categories.getText().contains("C")
							&& AssignName.getText() != null && percent >= 0
							&& worth != 0) {
						input = "Comm," + AssignName.getText() + "," + percent
								+ "," + worth;
					} else if (Categories.getText().contains("E")
							&& AssignName.getText() != null && percent >= 0
							&& worth != 0) {
						input = "Exam," + AssignName.getText() + "," + percent
								+ "," + worth;
					} else {
						JFrame Invalid = new JFrame();
						JLabel l1 = new JLabel("INVALID");
						Invalid.add(l1);
						Invalid.setSize(100, 100);
						Invalid.setLocationRelativeTo(null);
						Invalid.setVisible(true);
					}
				} catch (Exception Arg7) {
				}
				PrintWriter out;
				if (checker4 == 0) {
					try {
						out = new PrintWriter(new FileWriter(("Schools\\"
								+ selectedStudent + ".hi\\Current Classes\\"
								+ SearchBar3.getText() + ".txt"), true));
						out.append(System.getProperty("line.separator"));
						out.append(input);
						out.close();
					} catch (Exception e1) {
					}
					checker4 = 1;
				}
				AddFrame.setVisible(false);
			}
			if (a == back9) {
				Studentframe2.setVisible(true);
				StudentMarksFrame1.setVisible(false);
			}
			if (a == back10) {
				Studentframe2.setVisible(true);
				TeacherFrame3.setVisible(false);
				AttendanceFrame.setVisible(false);
				CourseList.removeAll();
			}
			if (a == AttendanceB) {
				AddFrame.setVisible(false);
				Attendance();
			}
			if (a == transcriptb) {
				Transcript();
			}
			if (a == AttendanceEnter) {
				AttendanceFrame.setVisible(false);
				try {
					if (checker6 == true) {
						BufferedWriter pw = new BufferedWriter(
								new FileWriter(
										("Schools\\" + selectedStudent
												+ ".hi\\Current Classes\\"
												+ SearchBar3.getText() + "_Attendance.txt"),
										true));
						pw.append((AttendanceT.getText() + ","));
						pw.close();
						checker6 = false;
					}
				} catch (Exception Arg8) {
				}
			}
		}
	
		// =====================================================================================================
		
		private void AdminStuff() {
			MainFrame1.setVisible(false);
			NewStudent.addActionListener(this);
			SearchBar.addMouseListener(this);
			NewStudent.setPreferredSize(new Dimension(150, 45));
			SearchBar.setPreferredSize(dimension);
			AdminFrame1.setSize(250, 190);
			MainPanel2.add(back);
			back.addActionListener(this);
			MainPanel2.add(NewStudent);
			MainPanel2.add(SearchBar);
			search.addActionListener(this);
			MainPanel2.add(search);
			AdminFrame1.add(MainPanel2);
			AdminFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			AdminFrame1.setResizable(false);
			AdminFrame1.setLocationRelativeTo(null);
			AdminFrame1.setVisible(true);
			MainPanel2.add(FAILURE);
		}
	
		private void AddStudent() {
			AdminFrame1.setVisible(false);
			Studentname.setPreferredSize(new Dimension(220, 30));
			StudentNum.setPreferredSize(new Dimension(220, 30));
			Studenthours.setPreferredSize(new Dimension(220, 30));
			AddStudent1.setSize(400, 200);
			Studentname.addMouseListener(this);
			StudentNum.addMouseListener(this);
			AddStudent1.add(NewStudentPanel);
			NewStudentPanel.add(back2);
			back2.addActionListener(this);
			NewStudentPanel.add(label1);
			NewStudentPanel.add(StudentNum);
			NewStudentPanel.add(label2);
			NewStudentPanel.add(Studentname);
			NewStudentPanel.add(Add);
			NewStudentPanel.add(worklabel);
			Add.addActionListener(this);
			AddStudent1.setResizable(false);
			AddStudent1.setLocationRelativeTo(null);
			AddStudent1.setVisible(true);
			Studenthours.addMouseListener(this);
		}
	
		// Adding Admin Info For new Student
		private void Add() {
			String names2 = StudentNum.getText();
			String names1 = Studentname.getText();
			Studentname.setText("");
			StudentNum.setText("");
			if (!names2.equals("Student Number")) {
				File directory = new File("Schools\\" + names2 + ".hi");
				if (!directory.exists()) {
					if (directory.mkdir()) {
						worklabel.setText("Student has been added");
						try {
							PrintWriter out;
							PrintWriter out2;
							out = new PrintWriter(new FileWriter("Schools\\"
									+ names2 + ".hi" + "\\"
									+ "Student Information.txt", true));
							out.println("Student Name: " + names1);
							out.println("Student Number: " + names2);
							out.println("Address:");
							out.println("Postal Code:");
							out.println("Phone Number:");
							out.println("Contact #1 Name:");
							out.println("Contact #1 Number:");
							out.println("Contact #1 Email:");
							out.println("Contact #2 Name:");
							out.println("Contact #2 Number:");
							out.println("Contact #2 Email:");
							out.println("Medical Alert #1:");
							out.println("Medical Alert #2:");
							out.println("Medical Alert #3:");
							out.println("Medical Alert #4:");
							out.println("Medical Alert #5:");
							out.println("Accomodation #1:");
							out.println("Accomodation #2:");
							out.println("Accomodation #3:");
							out.println("Accomodation #4:");
							out.println("Accomodation #5:");
							out.println("Volunteer Hours:");
							out2 = new PrintWriter(new FileWriter("Schools\\"+ names2+".hi" + "\\" + "Transcript.txt",true));
							out2.println("Course Code		Mark	Passed	Absences	Late");
							out.close();
							out2.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} else {
					worklabel.setText("Invalid");
				}
			}
		}
	
		private void Studentinfo() {
			File directory = new File("Schools\\" + SearchBar.getText() + ".hi");
			if (!directory.exists()) {
				FAILURE.setText("Student does not exist.");
			} else {
				studentinfo.setLayout(new FlowLayout());
				studentinfo.setTitle(SearchBar.getText());
				AdminFrame1.setVisible(false);
				studentinfo.setSize(280, 570);
				studentinfo.setResizable(false);
				studentinfo.setLocationRelativeTo(null);
				studentinfo.setVisible(true);
				panel1.add(back3);
				panel2.add(text);
				try {
					text.setText(writeToDisplay("Schools\\" + SearchBar.getText()
							+ ".hi" + "\\" + "Student Information.txt"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				transcriptb.addActionListener(this);
				panel3.add(update);
				panel3.add(transcriptb);
				studentinfo.add(panel1);
				studentinfo.add(panel2);
				studentinfo.add(panel3);
			}
		}
	
		public String writeToDisplay(String a) throws Exception {
			String fileText = "";
			BufferedReader in = new BufferedReader(new FileReader(a));
			String text = in.readLine();
			while (text != null) {
				fileText += text + "\n";
				text = in.readLine();
			}
			in.close();
			return fileText;
		}
	
		// ============================================================================================================
		private void TeacherStuff() {
			SearchBar3.addMouseListener(this);
			search3.addActionListener(this);
			back.addActionListener(this);
			MainFrame1.setVisible(false);
			teacherFrame.setSize(250, 100);
			SearchBar3.setPreferredSize(dimension);
			panel10.add(SearchBar3);
			panel10.add(search3);
			panel10.add(back);
			teacherFrame.add(panel10);
			teacherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			teacherFrame.setLocationRelativeTo(null);
			teacherFrame.setResizable(false);
			teacherFrame.setVisible(true);
		}
	
		private void TeacherStuff2() {
			checker2 = 0;
			if (checker3 == 0) {
				teacherFrame.setVisible(false);
				teacherFrame2.setSize(150, 150);
				teacherFrame2.setResizable(false);
				teacherFrame2.setLocationRelativeTo(null);
				File dir = new File("Schools\\");
				File[] files = dir.listFiles(new FilenameFilter() {
					public boolean accept(File dir, String name) {
						return name.toLowerCase().endsWith(".hi");
					}
				});
				for (int x = 0; x < files.length; x++) {
					File f = new File(files[x] + "//Current Classes//"
							+ SearchBar3.getText() + ".txt");
					if (f.exists() && !f.isDirectory()) {
						String temp = files[x] + SearchBar3.getText();
						temp = temp.replace(".hi" + SearchBar3.getText(), "");
						temp = temp.replace("Schools\\", "");
						Students[x] = temp;
						ClassList.addItem(Students[x]);
					}
				}
				teacherFrame.setLayout(new BorderLayout());
				ClassList.addActionListener(this);
				back7.addActionListener(this);
				panel11.add(label4);
				panel13.add(ClassList);
				panel12.add(back7);
				teacherFrame2.add(panel11, BorderLayout.NORTH);
				teacherFrame2.add(panel13, BorderLayout.CENTER);
				teacherFrame2.add(panel12, BorderLayout.SOUTH);
			}
			teacherFrame2.setVisible(true);
		}
	
		private void TeacherStuff3() {
			teacherFrame2.setVisible(false);
			Arrays.fill(Knowledge, null);
			Arrays.fill(Thinking, null);
			Arrays.fill(Application, null);
			Arrays.fill(Communication, null);
			Arrays.fill(Exam, null);
			int x = 0;
			int y = 0;
			int z = 0;
			int a = 0;
			int b = 0;
			try {
				BufferedReader br = new BufferedReader(new FileReader("Schools\\"
						+ selectedStudent + ".hi\\Current Classes\\"
						+ SearchBar3.getText() + ".txt"));
				String temp = "Hi";
				while (temp != null) {
					temp = br.readLine();
					if (temp.toLowerCase().contains("K/U".toLowerCase())) {
						temp.replace("K/U,", "");
						String[] parts = temp.split(",");
						Knowledge[x] = parts[1];
						x++;
						Knowledge[x] = parts[2];
						x++;
						Knowledge[x] = parts[3];
						x++;
					} else if (temp.toLowerCase().contains("T/I".toLowerCase())) {
						temp.replace("T/I,", "");
						String[] parts = temp.split(",");
						Thinking[y] = parts[1];
						y++;
						Thinking[y] = parts[2];
						y++;
						Thinking[y] = parts[3];
						y++;
					} else if (temp.toLowerCase().contains("App".toLowerCase())) {
						temp.replace("App,", "");
						String[] parts = temp.split(",");
						Application[z] = parts[1];
						z++;
						Application[z] = parts[2];
						z++;
						Application[z] = parts[3];
						z++;
					} else if (temp.toLowerCase().contains("Comm".toLowerCase())) {
						temp.replace("Comm,", "");
						String[] parts = temp.split(",");
						Communication[a] = parts[1];
						a++;
						Communication[a] = parts[2];
						a++;
						Communication[a] = parts[3];
						a++;
	
					} else if (temp.toLowerCase().contains("Exam".toLowerCase())) {
						temp.replace("Exam,", "");
						String[] parts = temp.split(",");
						Exam[b] = parts[1];
						b++;
						Exam[b] = parts[2];
						b++;
						Exam[b] = parts[3];
						b++;
					}
				}
				br.close();
			} catch (Exception Arg4) {
			}
		}
	
		private void TeacherStuff4() {
			checker4 = 0;
			double Kaverage = 0;
			int KWieght = 0;
			double Taverage = 0;
			int TWieght = 0;
			double Aaverage = 0;
			int AWieght = 0;
			double Caverage = 0;
			int CWieght = 0;
			double Eaverage = 0;
			int EWieght = 0;
			double TotalAverage = 0;
			int temp = 0;
			double temp2 = 0;
			panel35.removeAll();
			panel8.removeAll();
			panel14.removeAll();
			panel15.removeAll();
			panel16.removeAll();
			panel20.removeAll();
			TeacherFrame3.setLayout(new FlowLayout());
			int x1, x2, x3, x4, x5 = 0;
			// KNOWLEDGE
			{
				panel35.setLayout(new FlowLayout());
				panel35.add(label5);
				panel35.add(label6a);
				int spacer = 0;
				int counter = 1;
				while (Knowledge[spacer] != null) {
					spacer++;
				}
				spacer = spacer / 3;
				JTextArea stooooofs = new JTextArea();
				stooooofs.setSize(spacer, 4);
				stooooofs.setEditable(false);
				for (int x = 0; x < spacer * 3; x++) {
					if (x % 3 == 0 && x != 0) {
						stooooofs.append("\n");
					}
					else if (x!=0){
					for (int y=0;y<(12-Knowledge[x].length());y++){
						stooooofs.append("  ");
						}
					}
					stooooofs.append(Knowledge[x]);
					if (x == counter) {
	
						temp2 = Double.parseDouble(Knowledge[x]);
						temp = Integer.parseInt(Knowledge[x + 1]);
						Kaverage = (temp2 * temp) + Kaverage;
						KWieght = temp + KWieght;
						counter = counter + 3;
					}
					
				}
				Kaverage = Kaverage / KWieght;
				panel35.add(stooooofs);
				panel35.setPreferredSize(new Dimension(250, (spacer + 2) * 23));
				x1 = ((spacer + 2) * 23);
			}
			// Thinking
			{
				panel8.setLayout(new FlowLayout());
				panel8.add(label9);
				panel8.add(label6b);
				int spacer = 0;
				int counter = 1;
				while (Thinking[spacer] != null) {
					spacer++;
				}
				spacer = spacer / 3;
				JTextArea stooooofs = new JTextArea();
				stooooofs.setSize(spacer, 4);
				stooooofs.setEditable(false);
				for (int x = 0; x < spacer * 3; x++) {
					if (x % 3 == 0 && x != 0) {
						stooooofs.append("\n");
					}
					else if (x!=0){
						for (int y=0;y<(12-Knowledge[x].length());y++){
							stooooofs.append("  ");
							}
						}
					stooooofs.append(Thinking[x]);
					if (x == counter) {
						temp2 = Double.parseDouble(Thinking[x]);
						temp = Integer.parseInt(Thinking[x + 1]);
						Taverage = (temp2 * temp) + Taverage;
						TWieght = temp + TWieght;
						counter = counter + 3;
					}
					
				}
				panel8.add(stooooofs);
				panel8.setPreferredSize(new Dimension(250, (spacer + 2) * 23));
				x2 = ((spacer + 2) * 23);
				Taverage = Taverage / TWieght;
			}
			// Application
			{
				panel14.setLayout(new FlowLayout());
				panel14.add(label10);
				panel14.add(label6c);
				int spacer = 0;
				int counter = 1;
				while (Application[spacer] != null) {
					spacer++;
				}
				spacer = spacer / 3;
				JTextArea stooooofs = new JTextArea();
				stooooofs.setSize(spacer, 4);
				stooooofs.setEditable(false);
				for (int x = 0; x < spacer * 3; x++) {
					if (x % 3 == 0 && x != 0) {
						stooooofs.append("\n");
					}else if (x!=0){
						for (int y=0;y<(12-Knowledge[x].length());y++){
							stooooofs.append("  ");
							}
						}
					stooooofs.append(Application[x]);
					if (x == counter) {
						temp2 = Double.parseDouble(Application[x]);
						temp = Integer.parseInt(Application[x + 1]);
						Aaverage = (temp2 * temp) + Aaverage;
						AWieght = temp + AWieght;
						counter = counter + 3;
					}
					
				}
				panel14.add(stooooofs);
				panel14.setPreferredSize(new Dimension(250, (spacer + 2) * 23));
				x3 = ((spacer + 2) * 23);
				Aaverage = Aaverage / AWieght;
			}
			// Communcation
			{
				panel15.setLayout(new FlowLayout());
				panel15.add(label11);
				panel15.add(label6d);
				int spacer = 0;
				int counter = 1;
				while (Communication[spacer] != null) {
					spacer++;
				}
				spacer = spacer / 3;
				JTextArea stooooofs = new JTextArea();
				stooooofs.setSize(spacer, 4);
				stooooofs.setEditable(false);
				for (int x = 0; x < spacer * 3; x++) {
					if (x % 3 == 0 && x != 0) {
						stooooofs.append("\n");
					}
					else if (x!=0){
						for (int y=0;y<(12-Knowledge[x].length());y++){
							stooooofs.append("  ");
							}
						}
					stooooofs.append(Communication[x]);
					if (x == counter) {
						temp2 = Double.parseDouble(Communication[x]);
						temp = Integer.parseInt(Communication[x + 1]);
						Caverage = (temp2 * temp) + Caverage;
						CWieght = temp + CWieght;
						counter = counter + 3;
					}
					
				}
				panel15.add(stooooofs);
				panel15.setPreferredSize(new Dimension(250, (spacer + 2) * 23));
				x4 = ((spacer + 2) * 23);
				Caverage = Caverage / CWieght;
			}
			// Exam
			{
				panel16.setLayout(new FlowLayout());
				panel16.add(label12);
				panel16.add(label6e);
				int spacer = 0;
				int counter = 1;
				while (Exam[spacer] != null) {
					spacer++;
				}
				spacer = spacer / 3;
				JTextArea stooooofs = new JTextArea();
				stooooofs.setSize(spacer, 4);
				stooooofs.setEditable(false);
				for (int x = 0; x < spacer * 3; x++) {
					if (x % 3 == 0 && x != 0) {
						stooooofs.append("\n");
					}
					else if (x!=0){
						for (int y=0;y<(12-Knowledge[x].length());y++){
							stooooofs.append("  ");
							}
						}
					stooooofs.append(Exam[x]);
					if (x == counter) {
						temp2 = Double.parseDouble(Exam[x]);
						temp = Integer.parseInt(Exam[x + 1]);
						Eaverage = (temp2 * temp) + Eaverage;
						EWieght = temp + EWieght;
						counter = counter + 3;
					}
				}
				panel16.add(stooooofs);
				panel16.setPreferredSize(new Dimension(250, (spacer + 2) * 23));
				x5 = ((spacer + 2) * 23);
				Eaverage = Eaverage / EWieght;
			}
			panel20.setLayout(new GridLayout(6, 1));
			panel20.setSize(200, 200);
			JPanel panel22=new JPanel();
			panel22.setSize(200,50);
			panel20.add(panel22);
			int totalx = 125;
			
			
			// Averages For The Marks
			
			JLabel l2 = new JLabel("K/U Average: " + String.valueOf(Kaverage) + "%");
			JLabel l3 = new JLabel("Thinking/Inquiry Average: "
					+ String.valueOf(Taverage) + "%");
			JLabel l4 = new JLabel("Application Average: "
					+ String.valueOf(Aaverage) + "%");
			JLabel l5 = new JLabel("Communication Average: "
					+ String.valueOf(Caverage) + "%");
			JLabel l6 = new JLabel("Final Culminating Average: " + String.valueOf(Eaverage)
					+ "%");
			double divider = 0;
			try {
				BufferedReader br = new BufferedReader(new FileReader(
						"Schools/Available Classes/" + SearchBar3.getText()
								+ ".txt"));
				String reader = "Hi";
				while (reader != null) {
					reader = br.readLine();
					Kaverage = (Kaverage * (Double.parseDouble(reader)));
					if (Kaverage >= 0) {
						divider = Double.parseDouble(reader);
						TotalAverage = Kaverage;
						TeacherFrame3.add(panel35);
						panel20.add(l2);
						totalx=totalx+x1;
					}
					reader = br.readLine();
					Taverage = (Taverage * (Double.parseDouble(reader)));
					if (Taverage >= 0) {
						divider = Double.parseDouble(reader) + divider;
						TotalAverage = Taverage + TotalAverage;
						TeacherFrame3.add(panel8);
						panel20.add(l3);
						totalx=totalx+x2;
					}
					reader = br.readLine();
					Aaverage = (Aaverage * (Double.parseDouble(reader)));
					if (Aaverage >= 0) {
						divider = Double.parseDouble(reader) + divider;
						TotalAverage = Aaverage + TotalAverage;
						TeacherFrame3.add(panel14);
						panel20.add(l4);
						totalx=totalx+x3;
					}
					reader = br.readLine();
					Caverage = (Caverage * (Double.parseDouble(reader)));
					if (Caverage >= 0) {
						divider = Double.parseDouble(reader) + divider;
						TotalAverage = Caverage + TotalAverage;
						TeacherFrame3.add(panel15);
						panel20.add(l5);
						totalx=totalx+x4;
					}
					reader = br.readLine();
					Eaverage = (Eaverage * (Double.parseDouble(reader)));
					if (Eaverage >= 0) {
						divider = Double.parseDouble(reader) + divider;
						TotalAverage = Eaverage + TotalAverage;
						TeacherFrame3.add(panel16);
						panel20.add(l6);
						totalx=totalx+x5;
					}
				}
			} catch (Exception Arg5) {
			}
			// Setting Average Frames
			TotalAverage = (TotalAverage / divider);
			DecimalFormat df = new DecimalFormat("#.##");
			TotalAverage=Double.valueOf(df.format(TotalAverage));
			JLabel l7 = new JLabel("Total Average: " + TotalAverage + "%");
			panel20.add(l7);
			if (backaroo == true) {
				panel20.setLayout(new GridLayout(7, 1));
				panel20.add(back10);
				panel20.setSize(200, 240);
				totalx=totalx+130;
			}
			else{
				totalx=totalx+100;
			}
			TeacherFrame3.add(panel20);
			TeacherFrame3.setBounds(380, 240, 250, totalx);
			TeacherFrame3.setResizable(true);
			TeacherFrame3.setVisible(true);
		}
	
		private void AddingMarks() {
			MarkFrame.setLocationRelativeTo(null);
			AddMark.addActionListener(this);
			AttendanceB.addActionListener(this);
			back8.addActionListener(this);
			panel17.setLayout(new FlowLayout());
			Categories.addMouseListener(this);
			Categories.setPreferredSize(new Dimension(100, 25));
			panel17.add(Categories);
			panel17.add(AddMark);
			panel17.add(back8);
			panel17.add(AttendanceB);
			MarkFrame.add(panel17);
			MarkFrame.setBounds(190, 240, 180, 155);
			MarkFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			MarkFrame.setResizable(false);
			MarkFrame.setVisible(true);
		}
	
		private void AddingMarks2() {
			
			
			AssignName.setText("Assignment Name");
			Percentage.setText("Percentage");
			MarkWeighting.setText("Weighting");
			Enter.addActionListener(this);
			AddFrame.setLocationRelativeTo(MarkFrame);
			AddFrame.setBounds(190, 410, 130, 180);
			panel18.setLayout(new GridLayout(4,1,10,10));
			AssignName.setPreferredSize(new Dimension(110, 23));
			Percentage.setPreferredSize(new Dimension(110, 23));
			MarkWeighting.setPreferredSize(new Dimension(110, 23));
			AssignName.addMouseListener(this);
			Percentage.addMouseListener(this);
			MarkWeighting.addMouseListener(this);
			panel18.add(AssignName);
			panel18.add(Percentage);
			panel18.add(MarkWeighting);
			panel18.add(Enter);
			AddFrame.add(panel18);
			AddFrame.setResizable(false);
			AddFrame.setVisible(true);
		}
	
		// =================================================================================================================================================================================
		private void StudentStuff() {
			SearchBar2.addMouseListener(this);
			search2.addActionListener(this);
			back.addActionListener(this);
			MainFrame1.setVisible(false);
			Studentframe.setSize(200, 130);
			SearchBar2.setPreferredSize(new Dimension(150, 35));
			search2.setPreferredSize(new Dimension(100, 40));
			StudentPanel1.add(SearchBar2);
			StudentPanel1.add(search2);
			StudentPanel1.add(back);
			Studentframe.add(StudentPanel1);
			Studentframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Studentframe.setResizable(false);
			Studentframe.setLocationRelativeTo(null);
			Studentframe.setVisible(true);
		}
	
		private void StudentStuff2() {
			Studentframe.setVisible(false);
			CourseSelect.addActionListener(this);
			Marks.addActionListener(this);
			back4.addActionListener(this);
			CourseSelect.setPreferredSize(new Dimension(130, 45));
			Marks.setPreferredSize(new Dimension(130, 45));
			Studentframe2.setSize(180, 125);
			StudentPanel2.add(CourseSelect);
			File f = new File("Schools\\" + SearchBar2.getText() + ".hi"
					+ "\\Current Classes");
			if (f.exists()) {
				StudentPanel2.remove(CourseSelect);
				StudentPanel2.add(Marks);
				
			}
			
			StudentPanel2.add(back4);
			Studentframe2.add(StudentPanel2);
			Studentframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Studentframe2.setResizable(false);
			Studentframe2.setLocationRelativeTo(null);
			Studentframe2.setVisible(true);
		}
	
		// Deciding Student Courses
		private void Courses() {
			checker = 1;
			Studentframe2.setVisible(false);
			JScrollPane listScroller = new JScrollPane(list);
			JScrollPane listScroller2 = new JScrollPane(list2);
			CoursesFrame.setLayout(new BorderLayout());
			CoursesFrame.setSize(225, 260);
			CoursesFrame.setResizable(false);
			CoursesFrame.setLocationRelativeTo(null);
			try {
				BufferedReader br = new BufferedReader(new FileReader(new File(
						"Schools/Available Classes/CourseList.txt")));
				String thisLine;
				int x = 0;
				while ((thisLine = br.readLine()) != null) {
					courselist[x] = thisLine;
					x++;
				}
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			MouseListener mouseListener = new MouseAdapter() {
				int z = 0;
	
				public void mouseClicked(MouseEvent e) {
					list2.setFixedCellHeight(15);
					String selected = list.getSelectedValue().toString();
					int x = 0;
					try {
						for (x = 0; StudentCourseList[x] != null; x++) {
						}
						if (Arrays.asList(StudentCourseList).contains(selected)) {
						} else {
							StudentCourseList[x] = selected;
						}
					} catch (Exception arg3) {
					}
	
					CoursesFrame.getContentPane().validate();
					CoursesFrame.getContentPane().repaint();
				}
			};
			MouseListener mouseListener2 = new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					try {
						String selected = list2.getSelectedValue().toString();
						int x = Arrays.asList(StudentCourseList).indexOf(selected);
						StudentCourseList[x] = null;
					} catch (Exception Arg4) {
					}
				}
			};
			back6.addActionListener(this);
			Save.addActionListener(this);
			list.addMouseListener(mouseListener);
			list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
			list.setVisibleRowCount(-1);
			list2.addMouseListener(mouseListener2);
			listScroller.setPreferredSize(new Dimension(100, 150));
			listScroller2.setPreferredSize(new Dimension(100, 150));
			panel4.setLayout(new BorderLayout());
			panel4.add(Label1, BorderLayout.WEST);
			panel4.add(Label2, BorderLayout.EAST);
			panel5.add(listScroller);
			panel6.add(listScroller2);
			panel7.add(Save);
			panel7.add(back6);
			CoursesFrame.add(panel4, BorderLayout.NORTH);
			CoursesFrame.add(panel5, BorderLayout.WEST);
			CoursesFrame.add(panel6, BorderLayout.EAST);
			CoursesFrame.add(panel7, BorderLayout.SOUTH);
			CoursesFrame.setVisible(true);
		}
	
		private void Confirm() {
			Yes.addActionListener(this);
			No.addActionListener(this);
			Panel8.add(text2);
			Panel8.add(text3);
			Panel8.add(Yes);
			Panel8.add(No);
			Confirmation.add(Panel8);
			Confirmation.setSize(260, 120);
			Confirmation.setLocationRelativeTo(null);
			Confirmation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Confirmation.setVisible(true);
		}
	
		private void CurrentMarks() {
			Studentframe2.setVisible(false);
			AttendanceFrame.setVisible(false);
			StudentMarksFrame1.setSize(200, 150);
			panel21.removeAll();
			File files = new File("Schools\\" + SearchBar2.getText() + ".hi"
					+ "\\Current Classes\\");
			String[] names = files.list();
			
			String[] Classes = new String[30];
			if (checker7 == true) {
				for (int x = 0; x < names.length; x = x + 2) {
					Classes[x] = names[x].replace(".txt", "");
					CourseList.addItem(Classes[x]);
				}
				checker7 = false;
			}
			CourseList.addActionListener(this);
			back9.addActionListener(this);
			panel21.add(CourseList);
			panel21.add(back9);
			StudentMarksFrame1.add(panel21);
			StudentMarksFrame1.setLocationRelativeTo(null);
			StudentMarksFrame1.setResizable(false);
			StudentMarksFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			StudentMarksFrame1.setVisible(true);
		}
	
		// Reading for the Attendance both Student and Teacher
		private void Attendance() {
			AttendanceT.setText("P/L/E/A");
			try {
				BufferedReader br = new BufferedReader(new FileReader("Schools\\"
						+ selectedStudent + ".hi\\Current Classes\\"
						+ SearchBar3.getText() + "_Attendance.txt"));
				String temp;
				temp = br.readLine();
				String[] parts = temp.split(",");
				br.close();
				Collection<?> resultList = (Collection<?>) Arrays.asList(parts);
				present = Collections.frequency(resultList, "P");
				late = Collections.frequency(resultList, "L");
				excused = Collections.frequency(resultList, "E");
				absent = Collections.frequency(resultList, "A");
			} catch (Exception e) {
			}
			String Pl = new String("Present: " + present);
			String Ll = new String("Late: " + late);
			String El = new String("Excused Absence: " + excused);
			String Al = new String("Absence: " + absent);
			AttendanceText.setText(Pl + "\n" + Ll + "\n" + El + "\n" + Al);
			AttendanceText.setEditable(false);
			panel25.add(AttendanceText);
			if (Attendancer == true) {
				AttendanceEnter.addActionListener(this);
				AttendanceFrame.setLayout(new GridLayout(1, 2));
				panel27.setLayout(new GridLayout(2, 1));
				AttendanceT.setPreferredSize(new Dimension(100, 25));
				AttendanceT.addMouseListener(this);
				panel27.add(AttendanceT);
				panel27.add(AttendanceEnter);
				AttendanceFrame.add(panel27);
				AttendanceFrame.setBounds(650, 240, 300, 150);
			}
			if (Attendancer == false) {
				AttendanceFrame.setLayout(new FlowLayout());
				AttendanceFrame.remove(panel27);
				AttendanceFrame.setBounds(650, 240, 150, 150);
			}
			AttendanceFrame.add(panel25);
			checker6 = true;
			AttendanceFrame.setVisible(true);
		}
	
		private void Transcript() {
	
			try {
				BufferedReader br = new BufferedReader(new FileReader("Schools\\"
						+ SearchBar.getText() + ".hi\\Transcript.txt"));
				String stuff = br.readLine();
				transcriptA.setText("");
				while (stuff != null) {
					transcriptA.append(stuff + "\n");
					stuff = br.readLine();
				}
				br.close();
			} catch (Exception Arg9) {
			}
			transcriptp.add(back51);
			transcriptp.add(transcriptA);
			transcript.add(transcriptp);
			transcriptp.add(transcriptupdate);
			transcript.setSize(650, 570);
			transcript.setLocationRelativeTo(null);		studentinfo.setVisible(false);
			transcript.setVisible(true);
	
		}
	
		private void Transcriptedit() {
			try {
				PrintWriter out = new PrintWriter(new FileWriter("Schools\\"
						+ SearchBar.getText() + ".hi\\Transcript.txt"));
				out.write(transcriptA.getText());
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		// ============================================================================================================
		public void mouseEntered(MouseEvent arg0) {
		}
	
		public void mouseExited(MouseEvent arg0) {
		}
	
		public void mousePressed(MouseEvent arg0) {
		}
	
		public void mouseReleased(MouseEvent arg0) {
		}
	}