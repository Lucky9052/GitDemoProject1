
 class Exercise {
	 private String name;
	 private int difficultyLevel;
	 private int durationMinutes;
	 private String description;

	 public Exercise(String name, int difficultyLevel, int durationMinutes, String description) {
	  this.name = name;
	  this.difficultyLevel = difficultyLevel;
	  this.durationMinutes = durationMinutes;
	   this.description = description;
	    }

	public String getName() {
	   return name;
	  }

	public int getDifficultyLevel() {
	        return difficultyLevel;
	    }

	    public int getDurationMinutes() 
	    {
	        return durationMinutes;
	    }

	    public String getDescription() 
	    {
	        return description;
	    }
	}


