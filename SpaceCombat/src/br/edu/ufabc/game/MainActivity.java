package br.edu.ufabc.game;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	//private GameScreen gameScreen;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*gameScreen = new GameScreen(this);
		
		setContentView(gameScreen);
		
		Thread t = new Thread(gameScreen); */
	}
	
	public void botaoIniciar(View view){
		//setContentView(R.layout.tela_iniciar);
		
		String msg = "1";

		Bundle param = new Bundle();
		param.putString("msg", msg);

		Intent intent = new Intent(this, ActivityIniciar.class);

		intent.putExtras(param);

		startActivity(intent);
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}*/

	/*@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}*/
	/*
	public void onStart(){
		
	}
	
	public void onStop(){
			
	}
	
	public void onPause(){
		
	}
	
	public void onResume(){
		
	}
	
	public void onDestroy(){
		
	}
	
	public void onRestart(){
		
	}*/
}
