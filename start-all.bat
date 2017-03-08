@ECHO OFF 
start vmrun start "C:\work\VMs\Virtual Machines\Local_DataNode1_64-bit\Local_Hadoop_64-bit.vmx"
TIMEOUT /T 10
start vmrun start "C:\work\VMs\Virtual Machines\Local_DataNode2_64-bit\Local_Hadoop_64-bit.vmx"
TIMEOUT /T 10
start vmrun start "C:\work\VMs\Virtual Machines\Local_DataNode3-bit\Local_Hadoop_64-bit.vmx"
TIMEOUT /T 10
start vmrun start "C:\work\VMs\Virtual Machines\Local_DataNode4_64-bit\Local_Hadoop_64-bit.vmx"
TIMEOUT /T 20
start vmrun start "C:\work\VMs\Virtual Machines\Local_Hadoop_64-bit\Local_Hadoop_64-bit.vmx"
TIMEOUT /T 10
start vmrun start "C:\work\VMs\Virtual Machines\Local_HUE\Local_HUE.vmx"