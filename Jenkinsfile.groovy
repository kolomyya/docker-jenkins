node {
    properties([parameters([string(defaultValue: '127.0.0.1', description: 'Please specify IP', name: 'IP', trim: true)])])
    satge ("Remove container") {
        try {
            sh "ssh root${IP} docker rm  -f flaskex"
    }
        catch(exc) {
            sh "echo container deleted"
        }
    }

    stage("Run container " {
        sh " ssh root${@IP}  docker run -d  --name Flaskex -p 3300:3000  kolomyya/flaskex:v2" )
    }    
}