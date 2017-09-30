# StatusStories
StatusStories is an photo view implementation of
- Snapchat stories
- Instagram stories
- Whatsapp Statuses
- Facebook Messenger Stories

<img src="images/demo.gif" width=216 height=400 />


#### [APK Link](https://goo.gl/jZzyg8) | [Video Link](https://goo.gl/7Jx6Hx)

<img src="images/i0001.jpg" width=216 height=400 /> <img src="images/i0002.jpg" width=216 height=400 />

<img src="images/i0006.jpg" width=216 height=400 /> <img src="images/i0004.jpg" width=216 height=400 />


## Features at glance
------------------
- Highly customizable Stories view
- Click left right edge to move forward or previous just like WhatsApp
- Hold the center area to pause
- Cache the images using glide
- Progress bar indicates the downloaded content from the internet
- Immersive mode enables the more engaging experience
- Control the duration of each Story
- Finishes after the last story ends


## Install
-------
#1 Add it in your root build.gradle at the end of repositories:

```groovy
	allprojects {
		repositories {
		...
		maven { url "https://jitpack.io" }
		}
	}
```

#2. Add the dependency
```
	dependencies {
	        compile 'com.github.RahulJanagouda:StatusStories:master-SNAPSHOT'
	}

```

How to Use
----------

#1. As this uses Glide internally, please add this to root level repositories as this library uses glide to load the images.
```groovy
        maven { name 'glide-snapshot'; url 'http://oss.sonatype.org/content/repositories/snapshots' }
```

#2 Since you want to launch thw Status Stories Activity Add this to your project manifest inside <application> tag

```xml
        <activity android:name="com.rahuljanagouda.statussories.StatusStoriesActivity"/>
```
#3 Launch the activity with the configuration
```java
        Intent a = new Intent(view.getContext(), StatusStoriesActivity.class);
        a.putExtra(StatusStoriesActivity.STATUS_RESOURCES_KEY, resources);
        a.putExtra(StatusStoriesActivity.STATUS_DURATION_KEY, storyDuration);
        a.putExtra(StatusStoriesActivity.IS_IMMERSIVE_KEY, isImmersiveEnabled);
        a.putExtra(StatusStoriesActivity.IS_CACHING_ENABLED_KEY, isCacheEnabled);
        a.putExtra(StatusStoriesActivity.IS_TEXT_PROGRESS_ENABLED_KEY, isTextEnabled);
        startActivity(a);
```


Pulls are most welcome
----------------------



Inspired by [StoriesProgressView](https://github.com/shts/StoriesProgressView)


License
---

```
Copyright (C) 2017 Rahul Janagouda

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
