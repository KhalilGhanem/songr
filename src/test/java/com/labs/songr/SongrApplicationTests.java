package com.labs.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test void testAlbum(){
		Album NightVisions=new Album("Night Visions");
		NightVisions.setArtist("Imagine Dragons");

	}

}
