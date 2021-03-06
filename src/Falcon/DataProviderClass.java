package Falcon;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name = "searchProvider")
	public static Object[][] getDatafromDataprovider() {

		return new Object[][] {

				// Test IE Browser
				{ "4", "IE", "1", "11", "1", "Windows 10", "5", "1440x900" },
				{ "4", "IE", "1", "11", "2", "Windows 8.1", "3", "1280x1024" },
				{ "4", "IE", "1", "11", "3", "Windows 7", "3", "1280x1024" },
				{ "4", "IE", "2", "10", "1", "Windows 8", "3", "1280x1024" },
				{ "4", "IE", "2", "10", "2", "Windows 7", "3", "1280x1024" },
				{ "4", "IE", "3", "9", "1", "Windows 7", "3", "1280x1024" },

				{ "2", "ff", "12", "54", "4", "Windows 10", "5", "1280x1024" },
				{ "1", "Chrome", "19", "58", "8", "Windows 10", "2", "1280x1024" },

				// safari
				{ "6", "safari", "1", "12", "1", "Mojave", "2", "1280x1024" },
				{ "6", "safari", "2", "11", "1", "HighSierra", "8", "1920x1080" },
				{ "6", "safari", "2", "11", "2", "X El Capitan", "8", "1920x1080" },
				{ "6", "safari", "3", "10.1", "1", "Sierra", "8", "1920x1080" },
				{ "6", "safari", "4", "9", "1", "X El Capitan", "8", "1920x1080" },
				{ "6", "safari", "5", "8", "1", " OS X Yosemite", "8", "1920x1080" },
				{ "6", "safari", "6", "7", "1", " OS X Mavericks", "8", "1920x1080" },

				// chrome windows 10
				{ "1", "Chrome", "1", "72", "1", "Windows 10", "11", "2560x1440" },
				{ "1", "Chrome", "2", "71", "1", "Windows 10", "10", "2048x1536" },
				{ "1", "Chrome", "3", "70", "1", "Windows 10", "9", "1920x1200" },
				{ "1", "Chrome", "4", "69", "1", "Windows 10", "8", "1920x1080" },
				{ "1", "Chrome", "5", "68", "1", "Windows 10", "7", "1680x1050" },
				{ "1", "Chrome", "6", "67", "1", "Windows 10", "4", "1366x768" },
				{ "1", "Chrome", "7", "66", "1", "Windows 10", "6", "1600x1200" },
				{ "1", "Chrome", "8", "65", "1", "Windows 10", "7", "1680x1050" },
				{ "1", "Chrome", "9", "64", "1", "Windows 10", "5", "1440x900" },
				{ "1", "Chrome", "10", "63", "1", "Windows 10", "2", "1280x1024" },
				{ "1", "Chrome", "11", "62", "1", "Windows 10", "3", "1280x1024" },
				{ "1", "Chrome", "12", "61", "1", "Windows 10", "3", "1280x1024" },
				{ "1", "Chrome", "13", "50", "1", "Windows 10", "4", "1366x768" },
				{ "1", "Chrome", "14", "59", "1", "Windows 10", "9", "1920x1200" },
				{ "1", "Chrome", "15", "58", "1", "Windows 10", "8", "1920x1080" },
				{ "1", "Chrome", "16", "57", "1", "Windows 10", "7", "1680x1050" },
				{ "1", "Chrome", "17", "56", "1", "Windows 10", "6", "1600x1200" },
				{ "1", "Chrome", "18", "55", "1", "Windows 10", "5", "1440x900" },
				{ "1", "Chrome", "19", "54", "1", "Windows 10", "4", "1366x768" },
				{ "1", "Chrome", "20", "53", "1", "Windows 10", "3", "1280x1024" },
				{ "1", "Chrome", "21", "52", "1", "Windows 10", "2", "1280x800" },
				{ "1", "Chrome", "22", "51", "1", "Windows 10", "1", "1024x768" },

				// chrome windows 8.1
				{ "1", "Chrome", "1", "72", "2", "Windows 8.1", "11", "2560x1440" },
				{ "1", "Chrome", "2", "71", "2", "Windows 8.1", "10", "2048x1536" },
				{ "1", "Chrome", "3", "70", "2", "Windows 8.1", "9", "1920x1200" },
				{ "1", "Chrome", "4", "69", "2", "Windows 8.1", "8", "1920x1080" },
				{ "1", "Chrome", "5", "68", "2", "Windows 8.1", "7", "1680x1050" },
				{ "1", "Chrome", "6", "67", "2", "Windows 8.1", "4", "1366x768" },
				{ "1", "Chrome", "7", "66", "2", "Windows 8.1", "6", "1600x1200" },
				{ "1", "Chrome", "8", "65", "2", "Windows 8.1", "7", "1680x1050" },
				{ "1", "Chrome", "9", "64", "2", "Windows 8.1", "5", "1440x900" },
				{ "1", "Chrome", "10", "63", "2", "Windows 8.1", "2", "1280x1024" },
				{ "1", "Chrome", "11", "62", "2", "Windows 8.1", "3", "1280x1024" },
				{ "1", "Chrome", "12", "61", "2", "Windows 8.1", "3", "1280x1024" },
				{ "1", "Chrome", "13", "50", "2", "Windows 8.1", "4", "1366x768" },
				{ "1", "Chrome", "14", "59", "2", "Windows 8.1", "9", "1920x1200" },
				{ "1", "Chrome", "15", "58", "2", "Windows 8.1", "8", "1920x1080" },
				{ "1", "Chrome", "16", "57", "2", "Windows 8.1", "7", "1680x1050" },
				{ "1", "Chrome", "17", "56", "2", "Windows 8.1", "6", "1600x1200" },
				{ "1", "Chrome", "18", "55", "2", "Windows 8.1", "5", "1440x900" },
				{ "1", "Chrome", "19", "54", "2", "Windows 8.1", "4", "1366x768" },
				{ "1", "Chrome", "20", "53", "2", "Windows 8.1", "3", "1280x1024" },
				{ "1", "Chrome", "21", "52", "2", "Windows 8.1", "2", "1280x800" },
				{ "1", "Chrome", "22", "51", "2", "Windows 8.1", "1", "1024x768" },

				// chrome windows 8
				{ "1", "Chrome", "1", "72", "3", "Windows 8", "11", "2560x1440" },
				{ "1", "Chrome", "2", "71", "3", "Windows 8", "10", "2048x1536" },
				{ "1", "Chrome", "3", "70", "3", "Windows 8", "9", "1920x1200" },
				{ "1", "Chrome", "4", "69", "3", "Windows 8", "8", "1920x1080" },
				{ "1", "Chrome", "5", "68", "3", "Windows 8", "7", "1680x1050" },
				{ "1", "Chrome", "6", "67", "3", "Windows 8", "4", "1366x768" },
				{ "1", "Chrome", "7", "66", "3", "Windows 8", "6", "1600x1200" },
				{ "1", "Chrome", "8", "65", "3", "Windows 8", "7", "1680x1050" },
				{ "1", "Chrome", "9", "64", "3", "Windows 8", "5", "1440x900" },
				{ "1", "Chrome", "10", "63", "3", "Windows 8", "2", "1280x1024" },
				{ "1", "Chrome", "11", "62", "3", "Windows 8", "3", "1280x1024" },
				{ "1", "Chrome", "12", "61", "3", "Windows 8", "3", "1280x1024" },
				{ "1", "Chrome", "13", "50", "3", "Windows 8", "4", "1366x768" },
				{ "1", "Chrome", "14", "59", "3", "Windows 8", "9", "1920x1200" },
				{ "1", "Chrome", "15", "58", "3", "Windows 8", "8", "1920x1080" },
				{ "1", "Chrome", "16", "57", "3", "Windows 8", "7", "1680x1050" },
				{ "1", "Chrome", "17", "56", "3", "Windows 8", "6", "1600x1200" },
				{ "1", "Chrome", "18", "55", "3", "Windows 8", "5", "1440x900" },
				{ "1", "Chrome", "19", "54", "3", "Windows 8", "4", "1366x768" },
				{ "1", "Chrome", "20", "53", "3", "Windows 8", "3", "1280x1024" },
				{ "1", "Chrome", "21", "52", "3", "Windows 8", "2", "1280x800" },
				{ "1", "Chrome", "22", "51", "3", "Windows 8", "1", "1024x768" },

				// chrome windows 7
				{ "1", "Chrome", "1", "72", "4", "Windows 7", "12", "2560x1440" },
				{ "1", "Chrome", "2", "71", "4", "Windows 7", "11", "2048x1536" },
				{ "1", "Chrome", "3", "70", "4", "Windows 7", "10", "1920x1200" },
				{ "1", "Chrome", "4", "69", "4", "Windows 7", "9", "1920x1080" },
				{ "1", "Chrome", "5", "68", "4", "Windows 7", "8", "1680x1050" },
				{ "1", "Chrome", "6", "67", "4", "Windows 7", "5", "1366x768" },
				{ "1", "Chrome", "7", "66", "4", "Windows 7", "7", "1600x1200" },
				{ "1", "Chrome", "8", "65", "4", "Windows 7", "8", "1680x1050" },
				{ "1", "Chrome", "9", "64", "4", "Windows 7", "6", "1440x900" },
				{ "1", "Chrome", "10", "63", "4", "Windows 7", "3", "1280x1024" },
				{ "1", "Chrome", "11", "62", "4", "Windows 7", "1", "800x600" },
				{ "1", "Chrome", "12", "61", "4", "Windows 7", "4", "1280x1024" },
				{ "1", "Chrome", "13", "50", "4", "Windows 7", "5", "1366x768" },
				{ "1", "Chrome", "14", "59", "4", "Windows 7", "10", "1920x1200" },
				{ "1", "Chrome", "15", "58", "4", "Windows 7", "9", "1920x1080" },
				{ "1", "Chrome", "16", "57", "4", "Windows 7", "8", "1680x1050" },
				{ "1", "Chrome", "17", "56", "4", "Windows 7", "7", "1600x1200" },
				{ "1", "Chrome", "18", "55", "4", "Windows 7", "6", "1440x900" },
				{ "1", "Chrome", "19", "54", "4", "Windows 7", "5", "1366x768" },
				{ "1", "Chrome", "20", "53", "4", "Windows 7", "4", "1280x1024" },
				{ "1", "Chrome", "21", "52", "4", "Windows 7", "3", "1280x800" },
				{ "1", "Chrome", "22", "51", "4", "Windows 7", "2", "1024x768" },

				{ "1", "Chrome", "47", "72", "1", "Windows 10", "2", "1280x1024" },
				{ "1", "Chrome", "56", "72", "1", "Windows 10", "2", "1280x1024" },

				{ "1", "Chrome", "1", "72", "2", "Windows 8.1", "2", "1280x1024" },

				{ "1", "Chrome", "1", "65", "3", "Windows 8", "2", "1280x1024" },
				{ "1", "Chrome", "1", "65", "4", "Windows 7", "2", "1280x1024" },
				{ "1", "Chrome", "1", "65", "5", "macOS High Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "1", "65", "6", "macOS Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "1", "65", "7", "OS X El Capitan", "2", "1280x1024" },
				{ "1", "Chrome", "1", "65", "8", "OS X Yosemite", "2", "1280x1024" },
				{ "1", "Chrome", "2", "64", "1", "Windows 10", "2", "1280x1024" },
				{ "1", "Chrome", "2", "64", "2", "Windows 8.1", "2", "1280x1024" },
				{ "1", "Chrome", "2", "64", "3", "Windows 8", "2", "1280x1024" },

				{ "1", "Chrome", "2", "70", "4", "Windows 7", "2", "1280x1024" },
				{ "1", "Chrome", "2", "70", "5", "macOS High Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "2", "70", "6", "macOS Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "2", "70", "7", "OS X El Capitan", "2", "1280x1024" },
				{ "1", "Chrome", "2", "70", "8", "OS X Yosemite", "2", "1280x1024" },
				{ "1", "Chrome", "2", "70", "9", "OS X Mavericks", "2", "1280x1024" },
				{ "1", "Chrome", "3", "69", "1", "Windows 10", "2", "1280x1024" },
				{ "1", "Chrome", "3", "69", "2", "Windows 8.1", "2", "1280x1024" },

				{ "1", "Chrome", "3", "63", "3", "Windows 8", "2", "1280x1024" },
				{ "1", "Chrome", "3", "63", "4", "Windows 7", "2", "1280x1024" },
				{ "1", "Chrome", "3", "63", "5", "macOS High Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "3", "63", "6", "macOS Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "3", "63", "7", "OS X El Capitan", "2", "1280x1024" },
				{ "1", "Chrome", "3", "63", "8", "OS X Yosemite", "2", "1280x1024" },
				{ "1", "Chrome", "3", "63", "9", "OS X Mavericks", "2", "1280x1024" },

				{ "1", "Chrome", "4", "62", "1", "Windows 10", "2", "1280x1024" },
				{ "1", "Chrome", "4", "62", "2", "Windows 8.1", "2", "1280x1024" },
				{ "1", "Chrome", "4", "62", "3", "Windows 8", "2", "1280x1024" },
				{ "1", "Chrome", "4", "62", "4", "Windows 7", "2", "1280x1024" },
				{ "1", "Chrome", "4", "62", "5", "macOS High Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "4", "62", "6", "macOS Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "4", "62", "7", "OS X El Capitan", "2", "1280x1024" },
				{ "1", "Chrome", "4", "62", "8", "OS X Yosemite", "2", "1280x1024" },
				{ "1", "Chrome", "4", "62", "9", "OS X Mavericks", "2", "1280x1024" },
				{ "1", "Chrome", "5", "61", "1", "Windows 10", "2", "1280x1024" },
				{ "1", "Chrome", "5", "61", "2", "Windows 8.1", "2", "1280x1024" },
				{ "1", "Chrome", "5", "61", "3", "Windows 8", "2", "1280x1024" },
				{ "1", "Chrome", "5", "61", "4", "Windows 7", "2", "1280x1024" },
				{ "1", "Chrome", "5", "61", "5", "macOS High Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "5", "61", "6", "macOS Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "5", "61", "7", "OS X El Capitan", "2", "1280x1024" },
				{ "1", "Chrome", "5", "61", "8", "OS X Yosemite", "2", "1280x1024" },
				{ "1", "Chrome", "5", "61", "9", "OS X Mavericks", "2", "1280x1024" },
				{ "1", "Chrome", "6", "60", "1", "Windows 10", "2", "1280x1024" },
				{ "1", "Chrome", "6", "60", "2", "Windows 8.1", "2", "1280x1024" },
				{ "1", "Chrome", "6", "60", "3", "Windows 8", "2", "1280x1024" },
				{ "1", "Chrome", "6", "60", "4", "Windows 7", "2", "1280x1024" },
				{ "1", "Chrome", "6", "60", "5", "macOS High Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "6", "60", "6", "macOS Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "6", "60", "7", "OS X El Capitan", "2", "1280x1024" },
				{ "1", "Chrome", "6", "60", "8", "OS X Yosemite", "2", "1280x1024" },
				{ "1", "Chrome", "6", "60", "9", "OS X Mavericks", "2", "1280x1024" },

				{ "1", "Chrome", "5", "59", "1", "Windows 10", "3", "1280x1024" },
				{ "1", "Chrome", "5", "59", "2", "Windows 8.1", "3", "1280x1024" },
				{ "1", "Chrome", "7", "59", "3", "Windows 8", "2", "1280x1024" },
				{ "1", "Chrome", "7", "59", "4", "Windows 7", "2", "1280x1024" },
				{ "1", "Chrome", "7", "59", "5", "macOS High Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "7", "59", "6", "macOS Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "7", "59", "7", "OS X El Capitan", "2", "1280x1024" },
				{ "1", "Chrome", "7", "59", "8", "OS X Yosemite", "2", "1280x1024" },
				{ "1", "Chrome", "7", "59", "9", "OS X Mavericks", "2", "1280x1024" },
				{ "1", "Chrome", "8", "58", "1", "Windows 10", "2", "1280x1024" },
				{ "1", "Chrome", "8", "58", "2", "Windows 8.1", "2", "1280x1024" },
				{ "1", "Chrome", "8", "58", "3", "Windows 8", "2", "1280x1024" },
				{ "1", "Chrome", "8", "58", "4", "Windows 7", "2", "1280x1024" },
				{ "1", "Chrome", "8", "58", "5", "macOS High Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "8", "58", "6", "macOS Sierra", "2", "1280x1024" },
				{ "1", "Chrome", "8", "58", "7", "OS X El Capitan", "2", "1280x1024" },
				{ "1", "Chrome", "8", "58", "8", "OS X Yosemite", "2", "1280x1024" },
				{ "1", "Chrome", "8", "58", "9", "OS X Mavericks", "2", "1280x1024" }

		};
	}

}
