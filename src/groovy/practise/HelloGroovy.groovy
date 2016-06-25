package groovy.practise

/**
 * Created by kevinmonster on 16/6/25.
 */
def messge = "groovy!";
println messge;

def repeat(val) {
    for(i = 0; i < 5; i++){
        print val
    }
}

def repeat2(val) {
    for(i in 1..4) {
        print val
    }
}

repeat("groovy")
repeat2("groovy")