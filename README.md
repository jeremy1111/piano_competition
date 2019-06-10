The composite PianoCompetition class has-a component JudgePanel class. 
A PianoCompetition has the following instance variables:
•	judgePanel of type JudgePanel providing a has-a relationship between PianoCompetition and JudgePanel
•	musicPiece of type String which represents the name of the piece of music performed
A PianoCompetition object is initialised by providing arguments to the above two variables. If a judgePanel object does not exist already, the setter methods will create it.
The judgePanel attribute will reference an object of class JudgePanel which itself has three instance variables:
•	judgeNames of type String which represents the names of the judges
•	judgeCountries of type String which represents the countries of origin of the judges
•	passCandidate of type boolean. true means the panel passes a candidate, false means candidate fails
The user can initialise a JudgePanel object by providing arguments to all three instance variables. However, he/she can also set them using the setter methods at a later stage. A user can also choose to only provide the judges’ names if the other attributes are unknown, which will cause the constructor to provide default values to the latter.
The state of a JudgePanel object, namely the value of passCandidate, will determine the behaviour of PianoCompetition by telling it to return in the toString() method whether the judges want an encore or eliminate the candidate.
