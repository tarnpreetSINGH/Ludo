package com.example.ludo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainGame extends AppCompatActivity {

	/*ImageView[] se = {findViewById(R.id.e1),
			findViewById(R.id.e2),
	};*/

	Button button;
	ImageView BlueHome;
	ImageView RedHome;
	ImageView GreenHome;
	ImageView YellowHome;
	ImageView goal;
	ImageView no;
	ImageView e1;
	ImageView e2;
	ImageView e3;
	ImageView e4;
	ImageView e5;
	ImageView e6;
	ImageView e7;
	ImageView e8;
	ImageView e9;
	ImageView e10;
	ImageView e11;
	ImageView e12;
	ImageView e13;
	ImageView e14;
	ImageView e15;
	ImageView e16;
	ImageView e17;
	ImageView e18;
	ImageView e19;
	ImageView e20;
	ImageView e21;
	ImageView e22;
	ImageView e23;
	ImageView e24;
	ImageView e25;
	ImageView e26;
	ImageView e27;
	ImageView e28;
	ImageView e29;
	ImageView e30;
	ImageView e31;
	ImageView e32;
	ImageView e33;
	ImageView e34;
	ImageView e35;
	ImageView e36;
	ImageView e37;
	ImageView e38;
	ImageView e39;
	ImageView e40;
	ImageView e41;
	ImageView e42;
	ImageView e43;
	ImageView e44;
	ImageView e45;
	ImageView e46;
	ImageView e47;
	ImageView e48;
	ImageView e49;
	ImageView e50;
	ImageView e51;
	ImageView e52;
	ImageView eb1;
	ImageView eb2;
	ImageView eb3;
	ImageView eb4;
	ImageView eb5;
	ImageView er1;
	ImageView er2;
	ImageView er3;
	ImageView er4;
	ImageView er5;
	ImageView eg1;
	ImageView eg2;
	ImageView eg3;
	ImageView eg4;
	ImageView eg5;
	ImageView ey1;
	ImageView ey2;
	ImageView ey3;
	ImageView ey4;
	ImageView ey5;
	ImageView[] se = { no, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12,
			e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32,
			e33, e34, e35, e36, e37, e38, e39, e40, e41, e42, e43, e44, e45, e46, e47, e48, e49, e50, e51, e52,
			eb1, eb2, eb3, eb4, eb5, er1, er2, er3, er4, er5, eg1, eg2, eg3, eg4, eg5, ey1, ey2, ey3, ey4, ey5 };
	ImageView[] bse = new ImageView[58];
	ImageView[] rse = new ImageView[58];
	ImageView[] gse = new ImageView[58];
	ImageView[] yse = new ImageView[58];
	TextView tv1;
	TextView tv2;
	int bhome = 4;	//number of tokens in home
	int bwin = 0;	//number of tokens won
	int bactiv = 0;
	int rhome = 4;
	int rwin = 0;
	int ractiv = 0;
	int ghome = 4;
	int gwin = 0;
	int gactiv = 0;
	int yhome = 4;
	int ywin = 0;
	int yactiv = 0;
	int b1 = 0;
	int b2 = 0;
	int b3 = 0;
	int b4 = 0;
	int r1 = 0;
	int temp = 0;
	int temp2 = 0;
	int r2 = 0;
	int r3 = 0;
	int r4 = 0;
	int g1 = 0;
	int g2 = 0;
	int g3 = 0;
	int g4 = 0;
	int y1 = 0;
	int y2 = 0;
	int y3 = 0;
	int y4 = 0;
	int dice = 1+ new Random().nextInt(6);
	int bluewon = 0;
	int redwon = 0;
	int greenwon = 0;
	int yellowwon = 0;
	int wonplayer = 0;
	int turn = 1;
	int token = 1;
	int[] blue_home = {R.drawable.blue_home, R.drawable.blue_home1, R.drawable.blue_home2, R.drawable.blue_home3, R.drawable.blue_home4};
	int p = 0;
	String[] player = {"zero player","Blue", "Red", "Green", "Yellow", "this shouldn't be here, there's been some kinda mistake."};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_game);

		button = findViewById(R.id.button);
		BlueHome = findViewById(R.id.BlueHome);
		RedHome = findViewById(R.id.RedHome);
		GreenHome = findViewById(R.id.GreenHome);
		YellowHome = findViewById(R.id.YellowHome);
		goal = findViewById(R.id.goal);
		se[1] = findViewById(R.id.e1);
		se[2] = findViewById(R.id.e2);
		se[3] = findViewById(R.id.e3);
		se[4] = findViewById(R.id.e4);
		se[5] = findViewById(R.id.e5);
		se[6] = findViewById(R.id.e6);
		se[7] = findViewById(R.id.e7);
		se[8] = findViewById(R.id.e8);
		se[9] = findViewById(R.id.e9);
		se[10] = findViewById(R.id.e10);
		se[11] = findViewById(R.id.e11);
		se[12] = findViewById(R.id.e12);
		se[13] = findViewById(R.id.e13);
		se[14] = findViewById(R.id.e14);
		se[15] = findViewById(R.id.e15);
		se[16] = findViewById(R.id.e16);
		se[17] = findViewById(R.id.e17);
		se[18] = findViewById(R.id.e18);
		se[19] = findViewById(R.id.e19);
		se[20] = findViewById(R.id.e20);
		se[21] = findViewById(R.id.e21);
		se[22] = findViewById(R.id.e22);
		se[23] = findViewById(R.id.e23);
		se[24]= findViewById(R.id.e24);
		se[25] = findViewById(R.id.e25);
		se[26] = findViewById(R.id.e26);
		se[27] = findViewById(R.id.e27);
		se[28] = findViewById(R.id.e28);
		se[29] = findViewById(R.id.e29);
		se[30] = findViewById(R.id.e30);
		se[31] = findViewById(R.id.e31);
		se[32] = findViewById(R.id.e32);
		se[33] = findViewById(R.id.e33);
		se[34] = findViewById(R.id.e34);
		se[35] = findViewById(R.id.e35);
		se[36] = findViewById(R.id.e36);
		se[37] = findViewById(R.id.e37);
		se[38] = findViewById(R.id.e38);
		se[39] = findViewById(R.id.e39);
		se[40] = findViewById(R.id.e40);
		se[41] = findViewById(R.id.e41);
		se[42] = findViewById(R.id.e42);
		se[43] = findViewById(R.id.e43);
		se[44] = findViewById(R.id.e44);
		se[45] = findViewById(R.id.e45);
		se[46] = findViewById(R.id.e46);
		se[47] = findViewById(R.id.e47);
		se[48] = findViewById(R.id.e48);
		se[49] = findViewById(R.id.e49);
		se[50] = findViewById(R.id.e50);
		se[51] = findViewById(R.id.e51);
		se[52] = findViewById(R.id.e52);
		se[53] = findViewById(R.id.b1);
		se[54] = findViewById(R.id.b2);
		se[55] = findViewById(R.id.b3);
		se[56] = findViewById(R.id.b4);
		se[57] = findViewById(R.id.b5);
		se[58] = findViewById(R.id.r1);
		se[59] = findViewById(R.id.r2);
		se[60] = findViewById(R.id.r3);
		se[61] = findViewById(R.id.r4);
		se[62] = findViewById(R.id.r5);
		se[63] = findViewById(R.id.g1);
		se[64] = findViewById(R.id.g2);
		se[65] = findViewById(R.id.g3);
		se[66] = findViewById(R.id.g4);
		se[67] = findViewById(R.id.g5);
		se[68] = findViewById(R.id.y1);
		se[69] = findViewById(R.id.y2);
		se[70] = findViewById(R.id.y3);
		se[71] = findViewById(R.id.y4);
		se[72] = findViewById(R.id.y5);
		tv1 = findViewById(R.id.textView);
		tv2 = findViewById(R.id.textView2);

		for (int i=0; i<52; i++)
			bse[i]=se[i];
		bse[52]=se[53];
		bse[53]=se[54];
		bse[54]=se[55];
		bse[55]=se[56];
		bse[56]=se[57];
		bse[57]=goal;
		int j=0;
		for (int i=13; i<53; i++,j++)
			rse[j]=se[i];
		for (int i=1; i<13; i++,j++)
			rse[j]=se[i];
		rse[j] = se[58];
		rse[++j]=se[59];
		rse[++j]=se[60];
		rse[++j]=se[61];
		rse[++j]=se[62];
		rse[57]=goal;
		j=0;
		for (int i=26; i<53; i++,j++)
			gse[j]=se[i];
		for (int i=1; i<26; i++,j++)
			gse[j]=se[i];
		gse[j] = se[63];
		gse[++j]=se[64];
		gse[++j]=se[65];
		gse[++j]=se[66];
		gse[++j]=se[67];
		gse[57]=goal;
		j=0;
		for (int i=39; i<53; i++,j++)
			yse[j]=se[i];
		for (int i=1; i<39; i++,j++)
			yse[j]=se[i];
		yse[j] = se[68];
		yse[++j]=se[69];
		yse[++j]=se[70];
		yse[++j]=se[71];
		yse[++j]=se[72];
		yse[57]=goal;
		j=0;

		/*goal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				tv1.setText("Goal Clicked"+temp2);
				temp2++;
			}
		});*/

		button.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					if (wonplayer < 3 && token == 1) {
						token = 0;

						/*temp++;
						if (temp%2==0)
							goal.setClickable(true);
						else goal.setClickable(false);*/

						tv1.setText(player[turn]);
						taran();
						if (turn < 4)
							turn++;
						else turn = 1;

						if (bwin == 4)
							bluewon = 1;
						if (rwin == 4)
							redwon = 1;
						if (gwin == 4)
							greenwon = 1;
						if (ywin == 4)
							yellowwon = 1;

						wonplayer = bluewon+redwon+greenwon+yellowwon;

					}
				}
			});

	}

	public void taran() {
		if (turn == 1){
			if (bwin < 4){
				blueMove();
				if (bwin == 4)
					token =1;
			}
			else turn++;
		}
		if (turn == 2){
			if (rwin < 4)
				redMove();
			else turn++;
		}
		if (turn == 3){
			if (gwin < 4)
				greenMove();
			else turn++;
		}
		if (turn == 4){
			if (ywin < 4)
				yellowMove();
			else turn++;
		}
		else if (turn>4)
			Toast.makeText(this, "turn > 4", Toast.LENGTH_SHORT).show();
		//else Toast.makeText(this, "error in taran", Toast.LENGTH_SHORT).show();
	}

	private void yellowMove() {

		int dice = 1+ new Random().nextInt(6);
		tv2.setText(String.valueOf(dice));
		if (yactiv==0) {
			if (dice == 6) {
				y1 = 1;
				yactiv = 1;
				yse[1].setImageResource(R.drawable.safe_yellow);
				YellowHome.setImageResource(R.drawable.yellow_home3);
				yellowMove();
			}
		}
		if (yactiv == 1) {
			if (dice < 6) {
				if (y1+dice < 58){
					y1 += dice;
					if (y1 == 57) {
						yellowwon = 1;
					}
					move(y1, dice);
				}
				else Toast.makeText(this, "more than a required throw", Toast.LENGTH_SHORT).show();
			}
		}
		Toast.makeText(this, "yellow Move", Toast.LENGTH_SHORT).show();
		token = 1;

	}

	private void greenMove() {

		int dice = 1+ new Random().nextInt(6);
		tv2.setText(String.valueOf(dice));
		if (gactiv==0){
			if (dice == 6) {
				g1 = 1;
				gactiv = 1;
				gse[1].setImageResource(R.drawable.safe_green);
				GreenHome.setImageResource(R.drawable.green_home3);
				greenMove();
			}
		}
		if (gactiv == 1) {
			if (dice < 6) {
				if (g1+dice < 58){
					g1 += dice;
					if (g1 == 57) {
						greenwon = 1;
					}
					move(g1, dice);
				}
				else Toast.makeText(this, "more than a required throw", Toast.LENGTH_SHORT).show();
			}
		}
		Toast.makeText(this, "green Move", Toast.LENGTH_SHORT).show();
		token = 1;

	}

	private void redMove() {

		int dice = 1+ new Random().nextInt(6);
		tv2.setText(String.valueOf(dice));
		if (ractiv==0){
			if (dice == 6) {
				r1 = 1;
				ractiv = 1;
				rse[1].setImageResource(R.drawable.safe_red);
				RedHome.setImageResource(R.drawable.red_home3);
				redMove();
			}
		}
		if (ractiv == 1) {
			if (dice < 6) {
				if (r1+dice < 58){
					r1 += dice;
					if (r1 == 57) {
						redwon = 1;
					}
					move(r1, dice);
				}
				else Toast.makeText(this, "more than a required throw", Toast.LENGTH_SHORT).show();
			}
		}
		Toast.makeText(this, "red Move", Toast.LENGTH_SHORT).show();
		token = 1;

	}

	private void blueMove() {

		int dice = 1+ new Random().nextInt(6);
		tv2.setText(String.valueOf(dice));
		if (bactiv==0) {
			if (dice != 6)
				token = 1;
			if (dice == 6) {
				if (bhome == 4)
					b1 = 1;
				else if (bhome == 3)
					b2 = 1;
				else if (bhome == 2)
					b3 = 1;
				else if (bhome == 1)
					b4 = 1;
				bactiv++;
				bhome--;
				BlueHome.setImageResource(blue_home[bhome]);
				bse[1].setImageResource(R.drawable.safe_blue);
				blueMove();
				//token = 1;
			}
		}
		else if (bactiv == 1) {
			if (dice < 6) {
				if (b1 > 0 && b1 < 57)
					if (b1+dice < 58){
						b1 += dice;
						if (b1 == 57) {
							bwin++;
							bactiv--;
						}
						move(b1, dice);
					}
				else if (b2 > 0 && b2 < 57)
					if (b2+dice < 58){
						b2 += dice;
						if (b2 == 57) {
							bwin++;
							bactiv--;
						}
						move(b2, dice);
					}
				else if (b3 > 0 && b3 < 57)
					if (b3+dice < 58){
						b3 += dice;
						if (b3 == 57) {
							bwin++;
							bactiv--;
						}
						move(b3, dice);
					}
				else if (b4 > 0 && b4 < 57)
					if (b4+dice < 58){
						b4 += dice;
						if (b4 == 57) {
							bwin++;
							bactiv--;
						}
						move(b4, dice);
					}
				else Toast.makeText(this, "more than a required throw", Toast.LENGTH_SHORT).show();
				token = 1;
			}
			if (dice==6){
				if (bhome > 0)
					BlueHome.setClickable(true);
				if (b1 > 0 && b1 < 58){
					if (b1 + dice < 58){
						bse[b1].setClickable(true);
						bse[b1].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b1 = fun1(b1);
								blueMove();
							}
						});
					}
				}
				else if (b2 > 0 && b2 < 58){
					if (b2 + dice < 58){
						bse[b2].setClickable(true);
						bse[b2].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b2 = fun1(b2);
								blueMove();
							}
						});
					}
				}
				else if (b3 > 0 && b3 < 58){
					if (b3 + dice < 58){
						bse[b3].setClickable(true);
						bse[b3].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b3 = fun1(b3);
								blueMove();
							}
						});
					}
				}
				else if (b4 > 0 && b4 < 58){
					if (b4 + dice < 58){
						bse[b4].setClickable(true);
						bse[b4].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b4 = fun1(b4);
								blueMove();
							}
						});
					}
				}
				BlueHome.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						if (b1 < 1)
							b1 = 1;
						else if (b2 < 1)
							b2 = 1;
						else if (b3 < 1)
							b3 = 1;
						else if (b4 < 1)
							b4 = 1;
						bactiv++;
						bhome--;
						BlueHome.setImageResource(blue_home[bhome]);
						bse[1].setImageResource(R.drawable.safe_blue);
						//chk here for if there are any blue tokens at bse[1] and set resource accordingly.
						BlueHome.setClickable(false);
						bse[b1].setClickable(false);
						bse[b2].setClickable(false);
						bse[b3].setClickable(false);
						bse[b4].setClickable(false);
						blueMove();
						//token = 1;
					}
				});
			}
		}
		else if (bactiv > 1) {
			if (dice < 6) {
				if (b1 > 0 && b1 < 58){
					if (b1 + dice < 58){
						bse[b1].setClickable(true);
						bse[b1].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b1 = fun1(b1);
								token = 1;
							}
						});
					}
				}
				if (b2 > 0 && b2 < 58){
					if (b2 + dice < 58){
						bse[b2].setClickable(true);
						bse[b2].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b2 = fun1(b2);
								token = 1;
							}
						});
					}
				}
				if (b3 > 0 && b3 < 58){
					if (b3 + dice < 58){
						bse[b3].setClickable(true);
						bse[b3].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b3 = fun1(b3);
								token = 1;
							}
						});
					}
				}
				if (b4 > 0 && b4 < 58){
					if (b4 + dice < 58){
						bse[b4].setClickable(true);
						bse[b4].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b4 = fun1(b4);
								token = 1;
							}
						});
					}
				}
				else Toast.makeText(this, "more than a required throw", Toast.LENGTH_SHORT).show();
			}
			if (dice==6){
				if (b1 > 0 && b1 < 58){
					if (b1 + dice < 58){
						bse[b1].setClickable(true);
						bse[b1].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b1 = fun1(b1);
								blueMove();
							}
						});
					}
				}
				if (b2 > 0 && b2 < 58){
					if (b2 + dice < 58){
						bse[b2].setClickable(true);
						bse[b2].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b2 = fun1(b2);
								blueMove();
							}
						});
					}
				}
				if (b3 > 0 && b3 < 58){
					if (b3 + dice < 58){
						bse[b3].setClickable(true);
						bse[b3].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b3 = fun1(b3);
								blueMove();
							}
						});
					}
				}
				if (b4 > 0 && b4 < 58){
					if (b4 + dice < 58){
						bse[b4].setClickable(true);
						bse[b4].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b4 = fun1(b4);
								blueMove();
							}
						});
					}
				}
				else Toast.makeText(this, "more than a required throw", Toast.LENGTH_SHORT).show();
				if (bhome > 1){
					BlueHome.setClickable(true);
					BlueHome.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View view) {
							if (b1 < 1)
								b1 = 1;
							else if (b2 < 1)
								b2 = 1;
							else if (b3 < 1)
								b3 = 1;
							else if (b4 < 1)
								b4 = 1;
							bactiv++;
							bhome--;
							BlueHome.setImageResource(blue_home[bhome]);
							bse[1].setImageResource(R.drawable.safe_blue);
							//chk here for if there are any blue tokens at bse[1] and set resource accordingly.
							BlueHome.setClickable(false);
							bse[b1].setClickable(false);
							bse[b2].setClickable(false);
							bse[b3].setClickable(false);
							bse[b4].setClickable(false);
							blueMove();
							//token = 1;
						}
					});
				}
			}
		}
		/*else if (bactiv == 4) {
			if (dice < 6) {
				if (b1 > 0 && b1 < 58){
					if (b1 + dice < 58){
						bse[b1].setClickable(true);
						bse[b1].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b1 = fun1(b1);
								token = 1;
							}
						});
					}
				}
				if (b2 > 0 && b2 < 58){
					if (b2 + dice < 58){
						bse[b2].setClickable(true);
						bse[b2].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b2 = fun1(b2);
								token = 1;
							}
						});
					}
				}
				if (b3 > 0 && b3 < 58){
					if (b3 + dice < 58){
						bse[b3].setClickable(true);
						bse[b3].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b3 = fun1(b3);
								token = 1;
							}
						});
					}
				}
				if (b4 > 0 && b4 < 58){
					if (b4 + dice < 58){
						bse[b4].setClickable(true);
						bse[b4].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b4 = fun1(b4);
								token = 1;
							}
						});
					}
				}
				else Toast.makeText(this, "more than a required throw", Toast.LENGTH_SHORT).show();
			}
			if (dice==6){
				if (b1 > 0 && b1 < 58){
					if (b1 + dice < 58){
						bse[b1].setClickable(true);
						bse[b1].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b1 = fun1(b1);
								blueMove();
							}
						});
					}
				}
				if (b2 > 0 && b2 < 58){
					if (b2 + dice < 58){
						bse[b2].setClickable(true);
						bse[b2].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b2 = fun1(b2);
								blueMove();
							}
						});
					}
				}
				if (b3 > 0 && b3 < 58){
					if (b3 + dice < 58){
						bse[b3].setClickable(true);
						bse[b3].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b3 = fun1(b3);
								blueMove();
							}
						});
					}
				}
				if (b4 > 0 && b4 < 58){
					if (b4 + dice < 58){
						bse[b4].setClickable(true);
						bse[b4].setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								b4 = fun1(b4);
								blueMove();
							}
						});
					}
				}
				else Toast.makeText(this, "more than a required throw", Toast.LENGTH_SHORT).show();
				if (bhome > 1){
					BlueHome.setClickable(true);
					BlueHome.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View view) {
							if (b1 < 1)
								b1 = 1;
							else if (b2 < 1)
								b2 = 1;
							else if (b3 < 1)
								b3 = 1;
							else if (b4 < 1)
								b4 = 1;
							bactiv++;
							bhome--;
							BlueHome.setImageResource(blue_home[bhome]);
							bse[1].setImageResource(R.drawable.safe_blue);
							//chk here for if there are any blue tokens at bse[1] and set resource accordingly.
							BlueHome.setClickable(false);
							bse[b1].setClickable(false);
							bse[b2].setClickable(false);
							bse[b3].setClickable(false);
							bse[b4].setClickable(false);
							blueMove();
							//token = 1;
						}
					});
				}
			}
		}*/

		Toast.makeText(this, "blue move", Toast.LENGTH_SHORT).show();
		//token = 1;
	}

	public int fun1(int b) {
		b += dice;
		if (b == 57){
			bwin++;
			bactiv--;
		}
		move(b, dice);
		BlueHome.setClickable(false);
		bse[b-dice].setClickable(false);
		bse[b1].setClickable(false);
		bse[b2].setClickable(false);
		bse[b3].setClickable(false);
		bse[b4].setClickable(false);
		return b;
		//token = 1;
	}

	private void move(int t, int dice) {
		int loc = t-dice;
		//is safe? if yes, gotta see how many others are in that spot. continuation is for no safe.
		if (turn == 1){
			bse[loc].setImageResource(R.drawable.white);
			bse[t].setImageResource(R.drawable.blue);
		}
		else if (turn == 2){
			rse[loc].setImageResource(R.drawable.white);
			rse[t].setImageResource(R.drawable.red);
		}
		else if (turn == 3){
			gse[loc].setImageResource(R.drawable.white);
			gse[t].setImageResource(R.drawable.green);
		}
		else if (turn == 4){
			yse[loc].setImageResource(R.drawable.white);
			yse[t].setImageResource(R.drawable.yellow);
		}
		else Toast.makeText(this, "error in move, turn", Toast.LENGTH_SHORT).show();
	}
}