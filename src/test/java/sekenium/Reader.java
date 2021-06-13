package sekenium;

public class Reader {
	
	public static void main(String[] args) {
		
		ExcelReader excelReader  = new ExcelReader("E:\\workspace\\morning_7_8\\sekenium\\src\\main\\resources\\TestDat.xlsx");
		
		String sheetName = "TestData";
		
	int rownumber = excelReader.getRowCount(sheetName);

int colnumber = excelReader.getColumnCount(sheetName);
	

for(int i = 0;i<=rownumber;i++)
{
	for(int j = 0;j<=colnumber;j++)
	{
		System.out.println(excelReader.getCellData(sheetName, j, i));
		
	}
	

}
	
	}
	

}
