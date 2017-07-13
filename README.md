## Welcome to Local Apache Hadoop and hive setup using VWware playstation and Headless centos OS.

Many of us are using windows as our laptop OS , trust me Hadoop and hive binaries are still not compatible with windows OS.
Idea behind this repo is to setup a local hadoop setup to debug or run your local spark/mapreduce code locally and debug them if required.
In this page I am going to show you how I have setup a single node hadoop cluster from scratch , also we will see how can we easily extend our single node hadoop setup to
multiple node clusters. Currently I am running 4 node hadoop cluster in my Local.



### Apache Hadoop Hive Local Setup 

Download VM Player workstation 12 from below location:
https://drive.google.com/file/d/0B3jIjOSMX9F-eFRRY0NLam8wS2M/view?usp=sharing
Download centos iso image from below shared drive location.
https://drive.google.com/file/d/0B3jIjOSMX9F-bWM4QjFrcjJvZW8/view?usp=sharing
Install VmPlayer workstation 12 on your windows machine as an Administrator.

After you install VMPlayer 12 go to start and run VMPlayer 12.

![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image002.gif "Local hadoop Image image002.gif")

Now Click on Create New Virtual Machine Link

![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image003.png "Local hadoop Image image003.png")

Select third radio "I will install the operating system later"

![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image004.gif "Local hadoop Image image004.gif")




![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image006.gif "Local hadoop Image image006.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image007.png "Local hadoop Image image007.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image008.gif "Local hadoop Image image008.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image009.png "Local hadoop Image image009.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image010.gif "Local hadoop Image image010.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image011.png "Local hadoop Image image011.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image012.gif "Local hadoop Image image012.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image013.png "Local hadoop Image image013.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image014.gif "Local hadoop Image image014.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image015.png "Local hadoop Image image015.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image016.gif "Local hadoop Image image016.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image017.png "Local hadoop Image image017.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image018.gif "Local hadoop Image image018.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image019.png "Local hadoop Image image019.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image020.gif "Local hadoop Image image020.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image021.png "Local hadoop Image image021.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image022.gif "Local hadoop Image image022.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image023.png "Local hadoop Image image023.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image024.gif "Local hadoop Image image024.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image025.png "Local hadoop Image image025.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image026.gif "Local hadoop Image image026.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image027.png "Local hadoop Image image027.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image028.gif "Local hadoop Image image028.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image029.png "Local hadoop Image image029.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image030.gif "Local hadoop Image image030.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image031.png "Local hadoop Image image031.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image032.gif "Local hadoop Image image032.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image033.png "Local hadoop Image image033.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image034.gif "Local hadoop Image image034.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image035.png "Local hadoop Image image035.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image036.gif "Local hadoop Image image036.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image037.png "Local hadoop Image image037.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image038.gif "Local hadoop Image image038.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image039.png "Local hadoop Image image039.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image040.gif "Local hadoop Image image040.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image041.png "Local hadoop Image image041.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image042.gif "Local hadoop Image image042.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image043.png "Local hadoop Image image043.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image044.gif "Local hadoop Image image044.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image045.png "Local hadoop Image image045.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image046.gif "Local hadoop Image image046.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image047.png "Local hadoop Image image047.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image048.gif "Local hadoop Image image048.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image049.png "Local hadoop Image image049.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image050.gif "Local hadoop Image image050.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image051.png "Local hadoop Image image051.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image052.gif "Local hadoop Image image052.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image053.png "Local hadoop Image image053.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image054.gif "Local hadoop Image image054.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image055.png "Local hadoop Image image055.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image056.gif "Local hadoop Image image056.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image057.png "Local hadoop Image image057.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image058.gif "Local hadoop Image image058.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image059.png "Local hadoop Image image059.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image060.gif "Local hadoop Image image060.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image061.png "Local hadoop Image image061.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image062.gif "Local hadoop Image image062.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image063.png "Local hadoop Image image063.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image064.gif "Local hadoop Image image064.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image065.png "Local hadoop Image image065.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image066.gif "Local hadoop Image image066.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image067.png "Local hadoop Image image067.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image068.gif "Local hadoop Image image068.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image069.png "Local hadoop Image image069.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image070.gif "Local hadoop Image image070.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image071.png "Local hadoop Image image071.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image072.gif "Local hadoop Image image072.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image073.png "Local hadoop Image image073.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image074.gif "Local hadoop Image image074.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image075.png "Local hadoop Image image075.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image076.gif "Local hadoop Image image076.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image077.png "Local hadoop Image image077.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image078.gif "Local hadoop Image image078.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image079.png "Local hadoop Image image079.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image080.gif "Local hadoop Image image080.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image081.png "Local hadoop Image image081.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image082.gif "Local hadoop Image image082.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image083.png "Local hadoop Image image083.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image084.gif "Local hadoop Image image084.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image085.png "Local hadoop Image image085.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image086.gif "Local hadoop Image image086.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image087.png "Local hadoop Image image087.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image088.gif "Local hadoop Image image088.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image089.png "Local hadoop Image image089.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image090.gif "Local hadoop Image image090.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image091.png "Local hadoop Image image091.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image092.gif "Local hadoop Image image092.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image093.png "Local hadoop Image image093.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image094.gif "Local hadoop Image image094.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image095.png "Local hadoop Image image095.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image096.gif "Local hadoop Image image096.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image097.png "Local hadoop Image image097.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image098.gif "Local hadoop Image image098.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image099.png "Local hadoop Image image099.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image100.gif "Local hadoop Image image100.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image101.png "Local hadoop Image image101.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image102.gif "Local hadoop Image image102.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image103.png "Local hadoop Image image103.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image104.gif "Local hadoop Image image104.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image105.png "Local hadoop Image image105.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image106.gif "Local hadoop Image image106.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image107.png "Local hadoop Image image107.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image108.gif "Local hadoop Image image108.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image109.png "Local hadoop Image image109.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image110.gif "Local hadoop Image image110.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image111.png "Local hadoop Image image111.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image112.gif "Local hadoop Image image112.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image113.png "Local hadoop Image image113.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image114.gif "Local hadoop Image image114.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image115.png "Local hadoop Image image115.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image116.gif "Local hadoop Image image116.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image117.png "Local hadoop Image image117.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image118.gif "Local hadoop Image image118.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image119.png "Local hadoop Image image119.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image120.gif "Local hadoop Image image120.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image121.png "Local hadoop Image image121.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image122.gif "Local hadoop Image image122.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image123.png "Local hadoop Image image123.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image124.gif "Local hadoop Image image124.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image125.png "Local hadoop Image image125.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image126.gif "Local hadoop Image image126.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image127.png "Local hadoop Image image127.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image128.gif "Local hadoop Image image128.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image129.png "Local hadoop Image image129.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image130.gif "Local hadoop Image image130.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image131.png "Local hadoop Image image131.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image132.gif "Local hadoop Image image132.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image133.png "Local hadoop Image image133.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image134.gif "Local hadoop Image image134.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image135.png "Local hadoop Image image135.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image136.gif "Local hadoop Image image136.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image137.png "Local hadoop Image image137.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image138.gif "Local hadoop Image image138.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image139.png "Local hadoop Image image139.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image140.gif "Local hadoop Image image140.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image141.png "Local hadoop Image image141.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image142.gif "Local hadoop Image image142.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image143.png "Local hadoop Image image143.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image144.gif "Local hadoop Image image144.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image145.png "Local hadoop Image image145.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image146.gif "Local hadoop Image image146.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image147.png "Local hadoop Image image147.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image148.gif "Local hadoop Image image148.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image149.png "Local hadoop Image image149.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image150.gif "Local hadoop Image image150.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image151.png "Local hadoop Image image151.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image152.gif "Local hadoop Image image152.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image153.png "Local hadoop Image image153.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image154.gif "Local hadoop Image image154.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image155.png "Local hadoop Image image155.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image156.gif "Local hadoop Image image156.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image157.png "Local hadoop Image image157.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image158.gif "Local hadoop Image image158.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image159.png "Local hadoop Image image159.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image160.gif "Local hadoop Image image160.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image161.png "Local hadoop Image image161.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image162.gif "Local hadoop Image image162.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image163.png "Local hadoop Image image163.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image164.gif "Local hadoop Image image164.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image165.png "Local hadoop Image image165.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image166.gif "Local hadoop Image image166.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image167.png "Local hadoop Image image167.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image168.gif "Local hadoop Image image168.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image169.png "Local hadoop Image image169.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image170.gif "Local hadoop Image image170.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image171.png "Local hadoop Image image171.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image172.gif "Local hadoop Image image172.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image173.png "Local hadoop Image image173.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image174.gif "Local hadoop Image image174.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image175.png "Local hadoop Image image175.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image176.gif "Local hadoop Image image176.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image177.png "Local hadoop Image image177.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image178.gif "Local hadoop Image image178.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image179.png "Local hadoop Image image179.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image180.gif "Local hadoop Image image180.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image181.png "Local hadoop Image image181.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image182.gif "Local hadoop Image image182.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image183.png "Local hadoop Image image183.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image184.gif "Local hadoop Image image184.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image185.png "Local hadoop Image image185.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image186.gif "Local hadoop Image image186.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image187.png "Local hadoop Image image187.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image188.gif "Local hadoop Image image188.gif")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image189.png "Local hadoop Image image189.png")
![alt text](https://github.com/git-prodigy/local-hadoop-cluster/blob/master/github-pages/images/image190.gif "Local hadoop Image image190.gif")


Skip this error. Press Tab



































```
vi /etc/sysconfig/network-scripts/ifcfg-eth0
Change onboot=yes
```


Restart network 



Check ip addr



Now you can connect through putty using ip shown above 
192.168.5.130 (Use your IP)




Now install Mysql




```
yum install mysql-connector-java
```




Now connect to your new VM using winscp (Use your IP)




Create a folder hadoop under /opt




Copy hive,hadoop and jdk tar to /opt/hadoop



Create a user for all your service 
I have created with my uderId - araj

```
useradd araj
```


Give permission to /opt/hadoop to araj
```
chown -R araj:araj /opt/hadoop
```


Set password for newly created user
```
passwd araj
```


Now logout from winscp and login again with new user , for me its araj



Now lets make new user passwordless sudo 

```
echo 'araj ALL=(ALL) NOPASSWD:ALL' >> /etc/sudoers
```





Save with bang


Change user to araj(local user)



Un tar all tars

```
tar -zxvf hadoop-2.6.0.tar.gz ; tar -zxvf apache-hive-1.1.1-src.tar.gz ; tar -zxvf jdk-7u67-linux-x64.tar.gz ;
```




Edit user bashrc to set Env variables




```
export JAVA_HOME=/opt/hadoop/jdk1.7.0_67-cloudera
export HADOOP_HOME=/opt/hadoop/hadoop-2.6.0
export PATH=$PATH:$JAVA_HOME/bin:$HADOOP_HOME/bin:/opt/hadoop/apache-hive-1.2.1-bin/bin
export HADOOP_COMMON_LIB_NATIVE_DIR=$HADOOP_HOME/lib/native
export HADOOP_OPTS="-Djava.library.path=$HADOOP_HOME/lib"
export HIVE_HOME="/opt/hadoop/apache-hive-1.2.1-bin"
```
CHECK 


```
echo 'export JAVA_HOME=/opt/hadoop/jdk1.7.0_67-cloudera'>> ~/.bashrc
echo 'export HADOOP_HOME=/opt/hadoop/hadoop-2.6.0'>> ~/.bashrc
echo 'export PATH=$PATH:$JAVA_HOME/bin:$HADOOP_HOME/bin:/opt/hadoop/apache-hive-1.2.1-bin/bin'>> ~/.bashrc
echo 'export HADOOP_COMMON_LIB_NATIVE_DIR=$HADOOP_HOME/lib/native'>> ~/.bashrc
echo 'export HADOOP_OPTS="-Djava.library.path=$HADOOP_HOME/lib"'>> ~/.bashrc
echo 'export HIVE_HOME="/opt/hadoop/apache-hive-1.2.1-bin"'>> ~/.bashrc
```




Static IP - Lets assign static Ip to new VM - This step will disconnect VM from internet.
Revert these steps if you need to install any software using yum.


```
sudo vi /etc/sysconfig/network-scripts/ifcfg-eth0
```

Change dhcp to static
```
BOOTPROTO=static
```

Add below lines to the file (Use your IP)

```
IPADDR=192.168.5.130 
NETMASK=255.255.255.0
DEFROUTE=yes
PEERDNS=yes
PEERROUTES=yes
IPV4_FAILURE_FATAL=yes
IPV6INIT=no
NAME="System eth0"
```




 
Save this file
Restart Network 

```
sudo service network restart
```


Setup a passwordless ssh to localhost



Do 

```
ssh-keygen
```



Now try to do

```
ssh araj@192.168.5.130
```
 (Use your IP and username)
Check 




Now change hosts file entry: Type 
```
vi /etc/hosts 
```
command to open the file. 


Go to cd $HADOOP_HOME

Edit core-site.xml



Add property fs.default.name

 ```
 <property>
      <name>fs.default.name</name>
      <value>hdfs://local.hadoop.com:9000</value>
 </property>
```



Now edit hdfs-site.xml present under /opt/hadoop/hadoop-2.6.0/etc/hadoop



Add below property to hdfs-sit.xml

```
 <property>
   <name>dfs.replication</name>
   <value>1</value>
 </property>
 <property>
   <name>dfs.namenode.name.dir</name>
   <value>file:/opt/hadoop/dfs/namenode</value>
 </property>
 <property>
   <name>dfs.datanode.data.dir</name>
   <value>file:/opt/hadoop/dfs/datanode</value>
 </property>

 <property>
    <name>dfs.permissions</name>
    <value>false</value>
  </property>
```




Create a directory dfs under /opt/hadoop



Now its time to format your namenode

```
hadoop namenode -format
```










Go to 
```
./start-dfs.sh
$HADOOP_HOME/sbin/start-dfs.sh
```



Check if Namenode and secondary namenode isstarted successfully:
Run : jps






Now disable iptables:




Now from windows browser go to namenode UI to check if namenode is up and running :

http://192.168.5.130:50070/dfshealth.html#tab-overview (Use your IP)

You should see something like below:


Congratulation your hdfs is set up and ready to use.

Now stop dfs 



Currently your new VW is running with 1GB RAM and 1 cpu. We need to increase these settings.






Increase processor to 2 and memory to 2GB.

Hdfs setup is done , Now we need to do hive setup.

HIve metastore database - mysql

Become root and enter into mysql command line.

If you get below error , that means mysql server is not running 


Start mysql server 

Sudo service mysqld start



Let us start mysql server on server boot.

To do that :
```
chkconfig mysqld on
```


Go to mysql cmd line



Create a database called metastore using below command:


```
create database metastore DEFAULT CHARACTER SET utf8;
grant all on metastore.* TO 'hive'@'%' IDENTIFIED BY 'hive_password';
grant all on metastore.* TO 'hive'@'localhost' IDENTIFIED BY 'hive_password';
flush privileges;
```
To check run show databases;



```
use  metastore;
```


Now we have to source hive metastore tables into newly created database.

Note: Please use Hive 2.2 instead of hive 1.1.1
```
Source /opt/hadoop/apache-hive-1.1.1-bin/scripts/metastore/upgrade/mysql/hive-schema-0.11.0.mysql.sql
```


Check show tables


You metastore database is ready to use now.


Exit from mysql cmd line by entering exit command.


Go to hive installation:
Log in as local user (For me araj)
```
cd $HIVE_HOME
```


Inside conf directory create a new file hive-site.xml file 






```
<configuration>
   <property>
      <name>javax.jdo.option.ConnectionURL</name>
      <value>jdbc:mysql://localhost/metastore?createDatabaseIfNotExist=true</value>
      <description>metadata is stored in a MySQL server</description>
   </property>
   <property>
      <name>javax.jdo.option.ConnectionDriverName</name>
      <value>com.mysql.jdbc.Driver</value>
      <description>MySQL JDBC driver class</description>
   </property>
   <property>
      <name>javax.jdo.option.ConnectionUserName</name>
      <value>hive</value>
      <description>user name for connecting to mysql server</description>
   </property>
   <property>
      <name>javax.jdo.option.ConnectionPassword</name>
      <value>hive_password</value>
      <description>password for connecting to mysql server</description>
   </property>
</configuration>
```

Now create a soft link of mysql-java-connector jar  to hive lib 

Go to 
```
cd /opt/hadoop/apache-hive-1.1.1-bin/lib
```
Run below command to create softlink
```
ln -s /usr/share/java/mysql-connector-java.jar .
```


Before running any hive process ensure hdfs is up and running

```
$HADOOP_HOME\sbin\start-dfs.sh
```
Run jps command to check if namenode and secondary namenode and datanode is up .




Run hiveserver2 from bin folder 
```
nohup ./hiveserver2 &

OR
nohup $HIVE_HOME/bin/hiveserver2 &
```

To check logs go to 
```
tail -f /tmp/araj/hive.log
```


If you get exception below 



Then 
Run below command to mysql :

grant all on metastore.* TO 'hive'@'localhost' IDENTIFIED BY 'hive_password';
flush privileges;

To Kill running hive server2 


```
 ps -ef|grep hive

kill -9 2359
```

When service started log should say like below:
tail -100f /tmp/araj/hive.log


Now we have to start hive metastore service :

nohup ./hive --service metastore &

OR

nohup $HIVE_HOME/bin/hive --service metastore &





Check if these services are listening on desired port :

netstat -tunlep | grep LISTEN | awk '{print $4}' 



9083 - HIve metastore service port
10000 - Hive2 service port





If these ports are not listed then service not started successfully .



Stop Ip tables to run on system startup 

sudo chkconfig iptables off



Note: Need to add the winutils.






Test and Run Hive from CLI .

 $HIVE_HOME/bin/hive

If you get Exception as in screen below -




Update .bashrc -

 echo 'export HADOOP_USER_CLASSPATH_FIRST=true' >> ~/.bashrc
source ~/.bashrc

And then try -

 $HIVE_HOME/bin/hive





Now it's time to access hive database from dbvis:(Very interesting feature) 

Download hive-jdbc jar from the Drive shared location: https://drive.google.com/drive/folders/0B1F_bPl-BgWUYS0ySUlRal9QYzQ

In Db viz


Go to driver manager
Open Jar 





Select driver class as HS2 





Close Driver Manager window



Create new connection 



Click connect 




Enjoy !!




Markdown is a lightweight and easy-to-use syntax for styling your writing. It includes conventions for

```markdown
Syntax highlighted code block

# Header 1
## Header 2
### Header 3

- Bulleted
- List

1. Numbered
2. List

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)
```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/git-prodigy/local-hadoop-cluster/settings). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://help.github.com/categories/github-pages-basics/) or [contact support](https://github.com/contact) and we’ll help you sort it out.
