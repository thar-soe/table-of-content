//AUTHOR: Thar Soe
//modified: 02/22/2018

public class TocEntry {
	
	private String chapter;
	private int page;
	
	
	
	public TocEntry (String ch, int pg){
		
		chapter = ch;
		page = pg;
		
		
	}

	
	public String toString () {
		
	String pageNum = Integer.toString(page); 
	
	String text = chapter + "";

	int spaceDots = 40 -( chapter.length() + pageNum.length());
	
	StringBuilder sb = new StringBuilder (text); 
		
	for (int i = 0; i < spaceDots; i++ ) {
	
	sb.append("."); 
		
	}
	
	text = String.format("%-20s%s", sb, pageNum); 
		
		return text;
		
		
	}
	
	
	
	
	
	
}