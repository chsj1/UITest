package com.doodle.uitest;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

public class MyGame implements ApplicationListener {
	private Stage stage;
	private BitmapFont font;
	private LabelStyle style;
	private Label label;
	@Override
	public void create() {
		font = new BitmapFont(Gdx.files.internal("data/hhjd.fnt"),Gdx.files.internal("data/hhjd.png"),false);//file,image,flip(是否翻转)
		style = new LabelStyle(font,font.getColor());//所使用的字符库,和字符的颜色
		label = new Label("hello libGDX",style);//两个参数分别为:要显示的内容,labelstyle
		stage = new Stage(400,320,false);
		label.setPosition(50, 150);
		label.setFontScale(0.8f);
		label.setColor(Color.GREEN);
		stage.addActor(label);
		Gdx.input.setInputProcessor(stage);
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
	}
	@Override
	public void render() {
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		stage.act();
		stage.draw();
	}
	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
	}
	@Override
	public void resume() {
		// TODO Auto-generated method stub
	}
}
