package anno3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myFood")
public class MyFoodMgr {
	// 객체를 삽입할 경우에 자료형만 확인하고 삽입함.
	// bean 객체의 id와 변수명이 같을 경우에는 삽이이됨
	// => 그러나 bean 객체의 id와 변수명이 다를 경우에는 @Qualifier로 설정해야함
	@Autowired
	// @Qualifier : bean 객체를 id로 설정하는 어노테이션
	@Qualifier("favoriteFood")
	private Food favoriteFood;
	@Autowired
	@Qualifier("unFavoriteFood")
	private Food unFavoriteFood;
	
	@Override
	public String toString() {
		return "[좋아하는 음식=" + favoriteFood + " \n 싫어하는 음식=" + unFavoriteFood + "]";
	}
	// getter / setter
	public Food getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public Food getUnFavoriteFood() {
		return unFavoriteFood;
	}

	public void setUnFavoriteFood(Food unFavoriteFood) {
		this.unFavoriteFood = unFavoriteFood;
	}
	
}
