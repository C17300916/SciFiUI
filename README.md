# SciFi UI Project

Name: Christopher Brady

Student Number: C17300916


# Description of the assignment

My User Interface was originally inspired by the idea of Iron Man. I wanted to create an interface that could be seen inside a helmet of some sort of flying suit through space. I started this project by designing the space in the background, this took a lot of time as I decided to use random variables for the colours of the planets and also initially the size. 

# Instructions

### I added in some visual instructions to my system also but the *button* instructions for my system are as follows:

- *SPACE* ==> Applies boost to the UI, you should visually be able to see the stars / planets move faster, the fuel level should decrease faster, the boost level should also decrease, and the speedometer should increase to it's boost speed.

- *S*     ==> Allows the user to shoot a planet when the target is on it, you should see the planet dissapear and the bullet count decrease in Ammo.

- *e*     ==> Enables a user to exit a pressed button like map, you should see the map dissapear.

- *mouseClick* ==> on a button will open them and display different objects eg. a map

### Different Objects that can be seen :

- Map: This generates a random route ( in yellow ) and shows planets that it has to go by in blue which spawn in random spots and at random sizes.

- Health: This shows the overall health of the user in the system. The health automatically decreases over time in relation to four different properties: Brain ( *This goes down as the person is alone in space and his mental health would, in theory, decrease over time because of this sense of abandonement* ), Body ( *This goes down due to the assumption that being in space in just a metal suit will have a negative effect on your body* ), Lungs( *As the level of oxygen is very low and the change of atmospheric pressure is so prominent, I thought lungs would be an appropriate measure of health* ) and finally, Food & Water ( *This is an obvious health attribute as these levels are the most important for a humans health* ). These attributes decrease in tandem and are shown visually through a cross.
 
- Temperature: This object tells the temperature of the suit. For this interface I decided to make it increment and decrement randomly and rapidly. My decision for this was to simulate the unpredictable temperatures in space where if close to a planet or stars it could be extremely warm and when in deep space it could be extremely cold. 

- Distance: This object displays a distance time graph and resets every time it is spawned. 

- Ammo:

- Fuel and Oxygen:

- Boost: 

- Speedometer:


# How it works

# What I am most proud of in the assignment

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

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

