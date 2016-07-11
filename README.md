# Report Card Class

This project is part of the Udacity Android Basics Nanodegree. You can red the project rubric [here](https://review.udacity.com/#!/rubrics/160/view).

### ReportCard.java

This custom class provides a constructor to create a report card object by passing a student's id and optionally, the grades for all the courses.The grades for each course can also be modified using the various public Setters. To retrieve the report card data, the class provides one public method `toString()` that returns the data in valid JSON format.

### Example output

```
{
	"ReportCard": {
		"schoolYear": "2016-17",
		"semesterdId": "Fall",
		"studentId": 200,
		"mathGrade": 90,
		"englishGrade": 95,
		"spanishGrade": 93,
		"historyGrade": 89,
		"physicsGrade": 85,
		"biologyGrade": 96,
		"gymGrade": 99,
		"artGrade": 90,
		"mathGradeLetter": "A",
		"englishGradeLetter": "A",
		"spanishGradeLetter": "A",
		"historyGradeLetter": "B",
		"physicsGradeLetter": "B",
		"biologyGradeLetter": "A",
		"gymGradeLetter": "A",
		"artGradeLetter": "A"
	}
}
```

### Example test

```
ReportCard reportCard = new ReportCard(200);
reportCard.setMathGrade(90);
reportCard.setEnglishGrade(95);
reportCard.setSpanishGrade(93);
reportCard.setHistoryGrade(89);
reportCard.setPhysicsGrade(85);
reportCard.setBiologyGrade(96);
reportCard.setGymGrade(99);
reportCard.setArtGrade(90);
String reportCardString = reportCard.toString();
Log.d("result", reportCardString);
```
