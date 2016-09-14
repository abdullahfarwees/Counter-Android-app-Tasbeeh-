package unikappsfactory.tasbeehcounter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	int count=0;
	Button add , refresh ;
	TextView display;
	
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button)findViewById(R.id.count);
        refresh = (Button)findViewById(R.id.refresh);
        display = (TextView)findViewById(R.id.display);
        		
        	add.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					count++;
					display.setText(""+count);
					
				}
			});
        	
        	
        	refresh.setOnClickListener(new View.OnClickListener() {
	
        		@Override
        		public void onClick(View arg0) {
        			// TODO Auto-generated method stub
		
        			count=0;
		display.setText(""+count);
		
        		}
        	});
 
 
 
    }
    
    

 
    
}
