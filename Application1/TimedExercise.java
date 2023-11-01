 class  TimedExercise {
		    private int timeRemaining;

		    public TimedExercise(String name, int difficultyLevel, int durationMinutes, String description, int timeRemaining) {
		        super();
		        this.timeRemaining = timeRemaining;
		    }

		    public int getTimeRemaining() {
		        return timeRemaining;
		    }

		    public void decreaseTime(int seconds) {
		        if (timeRemaining >= seconds) {
		            timeRemaining -= seconds;
		        } else {
		            timeRemaining = 0;
		        }
		    }
		}

