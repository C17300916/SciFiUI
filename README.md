# SciFi UI Project

Name: Christopher Brady

Student Number: C17300916


# Description of the assignment

My User Interface was originally inspired by the idea of Iron Man. I wanted to create an interface that could be seen inside a helmet of some sort of flying suit
through space. I started this project by designing the space in the background, this took a lot of time as I decided to use random variables for the colours of
the planets and also initially the size. The planets move at a faster speed as they are much closer and smaller. To accompany the background i created I added a 
boost function that allows the "person in the suit" to speed up, and this is simulated through the stars and planets moving faster accross the screen. This function
is one of the most prevalent funcitons in my project as it nearly affects every other object within the interface. The purpose of this was to create an interface
not a game so there are still some bugs that can be found in some of the funcitonality like shooting. 

# Instructions
I added in some visual instructions to my system also but the instructions for my system are as follows:
" SPACE " ==> applies boost to the UI
" S "     ==> shoots bullets which are kept tract of in Ammo
" e " ==> will exit a button that has been pressed
clicking the target on a button will open them



# How it works

# What I am most proud of in the assignment
I was successfully able to connect all of the objects through inheritence and ---- which allowed them to work simultaneously and react to certain events simultaneously 
too. 

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](https://github.com/C17300916/SciFiUI)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

