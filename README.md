QuizyyBee

- Developer: Anton Oliver Frankie Ngobeni
- Student Number: ST10473173
- Group: Group 2
- Course: Higher Certificate in Mobile Application and Web Development 
- Subject: Introduction to Mobile Application Development 
 
 Links

- GitHub Repository Link:

https://github.com/VCSTDN2024/imad5112-assignment-2-ST10473173.git

- YouTube Video Link:

Project Overview

The “QuizzyBee App” is a kotlin-based Android application designed for educational use to test the users on a set of true and falses questions. The app has three screens: The Welcome screen that the user will see when they open the app, the user will then see a start button which will take them to the second screen with questions. After completing the set of questions the app will transition to the third screen where the user can review the score and what questions they got wrong. The user will also have an exit button which will close the app.

Purpose and Features

Purpose

The purpose of this app is to test and reinforce the users knowledge and help users assess their understanding about what is happening in the real world. This makes the app useful for educational reinforcement, preparing the user for an exam in a user friendly and engaging format.

Key Features 

- Multiple activity navigation
  
- App exit functionality
  
- Incorrect answer review
  
- Score calculations


Design Considerations

1.User Interface Design

- Simplicity and Clarity: The app features a clean and minimalistic interface with clearly labeled buttons for starting the quiz, selecting answers, reviewing results, and exiting. Each activity is focused on a single purpose: starting the quiz, answering questions, or displaying results which reduces cognitive load and makes navigation intuitive for users.

2.User Experience Design

- Instant Feedback: The quiz provides immediate feedback after each answer using Toast messages, informing users whether their answer was correct or incorrect before moving to the next question. This reinforces learning and keeps users engaged. At the end of the quiz, users receive a score summary along with motivational feedback, and they have the option to review any incorrect answers, enhancing the overall learning experience.


3.Technical Design

- Error Handling: The app includes basic error handling to ensure smooth interaction. For instance, in SecondActivity, if the user tries to proceed without selecting an answer, a Toast message prompts them to do so, preventing crashes and enforcing required input. Additionally, the use of safe null-handling techniques like Kotlin’s Elvis operator (?:) and default values ensures the app behaves reliably even if some intent data is missing.

4.Logo and Theme

-App name: Short and catchy name 


GitHub and GitHub Actions

This project was managed using “GitHub” for version control, where all code changes were committed.

I utilized Git-ub Actions to automate the build and deployment process. This includes:

• Running automated tests to ensure the app's functionality.

• Compiling the app into “APK” and “AAB” files, which are the formats required for distribution.

• Uploading these build artifacts to GitHub for easy access.


The workflow ensures that my project is automatically built and tested every time I push changes, and it simplifies the process of delivering the final APK/AAB files for submission




Screenshots

What the user will see when the start up the app:

![UI](https://github.com/user-attachments/assets/582770c5-930f-4695-9515-5d6dc8cc7375)


Figure. 1. UI


Second screen after they press start (Questions):

![questions](https://github.com/user-attachments/assets/3d8b21d5-4289-436e-921a-3c83838fa82a)


Figure. 2. Questions 

When the user does not choose between “True or False” the app will prompt the user at the bottom of the app saying (Please select  an answer):

![didnt choose a answer](https://github.com/user-attachments/assets/9b13a9bd-0a66-461d-b276-7279650ba190)

Figure. 3 Choose an answer

When the user chooses an answer between “True or False” is will prompt the user at the bottom the app if the answer is (correct or incorrect):

![correct or incorrect](https://github.com/user-attachments/assets/12936d2a-ceac-4297-aeaa-10e1bf631b1b)

Figure. 4 Correct or Incorrect

After  answering all the questions the the score will pop out:

![score](https://github.com/user-attachments/assets/be52d280-b2c7-4a42-b961-73545152372b)

Figure. 5. Score

When the review is pressed it will show the answers you got incorrect:

![review button](https://github.com/user-attachments/assets/17692f3f-3e85-483b-88f7-2c8c56acd235)

Figure. 6. Review button


Challenges and Learnings 

1.UI and UX Design

-Challenge: Making the interface intuitive yet engaging

-Solution: Previous apps and notes done in class helped me face this challenge

2.UI elements

-Challenges: UI elements were not aligning to the the screen size

-Solution: I did a test on multiple screen sizes and the layout, I ended up choosing the constraint layout.

3.Adding unnecessary buttons and textviews

-Challenges: Overcomplicating features 

-Solution: Sticking to what the project is asking and not what I'm asking for.


“I learnt that every bug you solve makes the app better than before, and I also need to be patient and ask for help when needed.”

Future Enhancements

Future Upgrades -  For future upgrades I would organise the questions into categories (e.g Math, Sciences, History, Art). I would allow users to pick a topic or difficult level. Something I would also add is a countdown timer for each question to make it more challenging.


References 

Link: W3schools.com (no date) W3Schools Online Web Tutorials. Available at: https://www.w3schools.com/kotlin/kotlin_functions.php (Accessed: 26 March 2025). 

Link: Learn Kotlin from scratch (no date) Coding Blocks Online. Available at: https://online.codingblocks.com/courses/kotlin-basics (Accessed: 27 March 2025).

Link: https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/IIE%20Student%20Materials/New%20Student%20Materials%20CAT/IMAD5112/2025/Term%201/IMAD5112_MM.docx?d=wa1ff62f08e1a47bc99bdca07ae24427d&csf=1&web=1&e=KN9fJa

List Of Figures

Figure 1: UI

Figure 2: Questions 

Figure 3: Choose an answer

Figure 4: Correct or Incorrect

Figure 5: Score

Figure 6: Review button

Figure 7: Chat 1

Figure 8: Chat 2

Figure 9: Chat 3

Disclosure Of AI Usage In My Assignment

In the development of this project, I have used generative Ai tools to assist in various parts of the assignment 

1.In which  generative was AI used

- To help me change the colour of the texts and buttons.
  
- To help me add more screens in my app.
  
-To help me choose questions to ask.

2.Name of AI tools used

-ChatGPT

3.Purpose behind the use

-To help me make the imageview fit the full background.

-To help me improve the app and make it look fun to use.

-To help me change the colour of buttons and texts.
 
4.Dates in which AI was used

-Chat 1: 23 April 2025

-Chat 2: 25 April 2025

-Chat 3: 29 April 2025


5.Link to AI chats or screenshots

-Chat 1: Asking for Blue colour code.

![colour code](https://github.com/user-attachments/assets/4f6f7a8b-5560-4560-baa1-8fb7770b2a16)

Figure. 7. Chat 1

-Chat 2: Help making my image view fit the full screen.

![background fit](https://github.com/user-attachments/assets/f48a6d47-5f83-41a0-8e03-3fd20e3729d1)

Figure. 8. Chat 2

-Chat 3: How to add a second screen.

![second screen](https://github.com/user-attachments/assets/50452283-766c-484f-b1e3-1ff729f6da39)

Figure. 9. Chat 3


