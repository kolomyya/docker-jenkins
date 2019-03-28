node {
 properties([parameters([string(defaultValue: '159.203.122.51', description: 'Docker Host', name: 'IP', trim: false), string(defaultValue: 'latest', description: 'Version of the App', name: 'VER', trim: false), string(defaultValue: '4000', description: 'What port would you like to run', name: 'PORT', trim: false)])])    
    stage("Run container ") {
        sh " ssh root@${IP}  docker run -d  --name Flaskex -p ${PORT}  kolomyya/flaskex:${VER}" 
     }    
}
