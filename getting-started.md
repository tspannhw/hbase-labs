Getting started guide for Hadoop Labs
=====================================

## STEP 1) login to the cluster
Login in to the cluster assigned to you using SSH.  Instructor will provide details.
```bash
    $  ssh <user name>@<hostname>
e.g $  ssh ec2-user@ec2.........
```


You will be placed in home dir : `/home/<login user>`  
e.g.    `/home/ubuntu`    or `/home/ec2-user`  


## STEP 2) : Make a personal workspace in linux

after you login
```bash
        $  cd    # get to home dir
        $  mkdir   <your name>
e.g.    $  mkdir   sujee
        $ cd   <your name>     #   <-- this is your personal space
```


## STEP 3) : copy code 

Copy the code from the your home directory to your personal directory

```
   cp -r ~/hbase-labs <your name>/
```


## STEP 4) : Cluster inspection using Web UIs
Browse UIs for (Instructor will provide details)
* Managers
* NameNode
* YARN


## ==== For Instructor only ====
Create a HDFS home dir for `<login user>  (hdfs:///user/<login_name>)`

```bash
    $ sudo -u hdfs   hdfs dfs -mkdir   /user/$USER
    $ sudo -u hdfs  hdfs dfs -chown $USER /user/$USER

    # verify permissions
    $   hdfs  dfs -ls /user/
```

Make sure a directory named `/user/<login_user>` exists and is owned by `<login_user>`

