# Git 

### Git Internal States 
1. HEAD(Pointer): Represents the current commit that your branch is pointing to.
2. Staging Index (Index): A snapshot of your working directory that you propose to be the next commit.
3. Working Directory: The actual files and directories on your local filesystem where you are making changes.

## Global Configurations:
1. Set username

    **git config --global user.name**
    
    git config --global user.name {name}
2. Set user email 

    **git config --global user.email**

    git config --global user.email {email}
3. Set automatic CLI Colouring for better reviewing 

    **git config --global color.ui auto**

## Repo Creation:
1. Set a local folder as a git local repository

    **git init**
2. Link remote repository with local repository

    **git remote add origin**

    git remote add origin {repo url}
3. Clone remote repository in local environment

    **git clone**

    git clone {repo url}

## Stage & Snapshot
1. Add modified files to the staging area

    **git add**

    git add . => Adds all the files to staging area

    git add {file} => Add specific files to the staging area

2. View the status of the working directory and the staging area

    **git status**

3. Save the modified changes (Captures a snapshot) (With descriptive message)

    **git commit -m**

    git commit -m "My commit"
4. Shows the changes maded which are not yed added to the staging area (unstaged changes in the working directory)

    **git diff**

    git diff {commitID1} {CommitID2} => Difference between two commits

    git diff {branch1} {branch2} => Difference between two branches

    git diff {commitID} => Difference between the specified commit and the working directory

5. Shows the changes maded and staged which are not yet in the head(recent commit)

    **git diff --staged** or **git diff --cached**
6. Restores working directory or staging area files to the last committed state without creating a commit.

    **git reset --soft** 

    git reset --soft {commitID} => Moves the head to the desired commit and the changes from the commits after that desired commit are staged 

    Moves head, keeps index and changes in working directory

    **git reset** or **git reset --mixed**

    git reset <commitID> => Moves the head to the desired commit and the changes from the commits after desired commit are unstaged, but the modifications are preserved.
    Moves head, resets index to that commit, keeps changes in the working directory.

    **git reset --hard** 

    git reset --hard {commitID} => Moves the head to the desired commit and the changes from the commits after desired commit are discarded

    Moves head, resets index and the working directory
7. Undo the changes introduced by the specified commit and the commit history is preserved (no rewriting history)

    **git revert**

    git revert {commitID} => Brings the exact committed state, where all of them are unstaged and open to modifications(editor window) which can be created as a new commit later (automatic commit)

    git revert --no-commit {commitID} => Restores the version where there is no necessity to commit after modifications

    **git revert HEAD** 

    git revert HEAD => Reverts the previous commit 

    git revert HEAD~n..HEAD => Brings the version before n commits (Range)
8. Restores and preserves the previous saved version 

    **git restore**

    git restore {filename} => Restores the file to it's head (Discards uncommitted changes)

    git restore --staged {filename} => Unstages the files(move from index to working directory) (Keeps working directory changes)

    git restore --source {commitID} {filename} => Restores the specified file to its desired commit in to the working directory
9. Rewrite history by replaying commits on top of another branch to create linear history. (No merge commits)

    Rule: Rebase before push → Merge after push

    **git rebase**

    git rebase {branch}

    git rebase origin/main

    git rebase --continue => Continue after resolving conflict

    git rebase --abort => Abort rebase process

    git rebase -i => Interactive rebase (edit, squash, reorder commits)
10. Apply a specific commit from another branch into current branch. Selective copy without merging entire branch

    **git cherry-pick**

    git cherry-pick {commitID}
11. Shows everything HEAD ever pointed to — even after reset, rebase, deleted branches.

    **git reflog**

## Branching & Merging
1. Create new branch
    **git branch**

    git branch {branchname} => Creates new branch as the copy of the current branch

    git branch {branchname} {currentBranch} => Creates new branch as the copy of the specified branch

    **git checkout -b**

    **git switch -c**

    git checkout -b {branchname} => Creates new branch and switched to it
    
    git switch -c {branchname} => Creates new branch and switched to it
2. Lists all branches in the working directory

    **git branch**
3. Switch branches

    **git switch** or **git checkout**

    git switch {branchname}

    git checkout {branchname}
4. Rename branch

    **git branch -m**

    git branch -m {new branch name} => Renames the current branch

5. Merging branches 

    **git merge**

    git merge {branch name} => merges the specified branch with the current branch
6. View all remote branches

    **git branch -r**

7. Check upstream branch

    **git branch vv**

## Inspect & Compare
1. View all the commits

    **git log**

    git log => Shows all the commits (with info)

    git log --oneline => Shows all the commits as in one line(only commit id and msg will be specified)

    git log --graph => The commit history is shown as a graph (commit tree)

    git log --stat -M => Shows the commit history with the changes info

    git log --follow {file} => Shows the changes that changed file, even across renames
2. Shows info about commits (In human readable form)

    **git show**

    git show => Show info about latest commit

    git show {commitID} => Show info about specified commit

    git show --no-patch => Only show commit message

    git show --name-only => Show only names of the modified files

    git show --stat => Show only difference stat
3. Compare and show the difference

    **git diff**

    git diff {commitID1} {commitID2} => Difference between two commits

    git diff {branch1} {branch2} => Difference between two branches

    git diff {commitID} => Difference between the specified commit and the working directory

    git diff --staged or git diff --cached => Shows the changes maded and staged which are not yet in the working directory(recent commit)
    
## Share and Update
1. Link remote repository to local repository

    **git remote add origin**

    git remote add origin {repo url}
2. Update local repo with remote repo knowledge without modifying index or working directory (Downloads new commits)
(Does not merge into current branch)

    **git fetch**

    git fetch origin {branch} => Only fetch that branch

    git fetch origin 
3. Fetches and merges the updates(latest remote changes) for current branch only (Automatically modifies working directory)

    **git pull**

    git pull 

    git pull origin {branch}
4. Updates the changes to the remote repository

    **git push**

    git push -u => Links your local branch to a remote branch so future pushes don’t need the remote name.

## Temporary Commits
1. Temporarily save uncommitted changes (in hidden stack). Staged and unstaged changes are saved. Cleans working directory.

    **git stash**

    git stash push -m "Message" -> Stash with message
2. View stash list

    **git stash list**

3. Apply latest stash

    **git stash apply**
4. Apply and remove from stash

    **git stash pop**
5. Stash only saved files

    **git stash --staged**
6. Drop a specific stash 

    **git stash drop**

    git stash drop {stash id}

    git stash drop {stash message}
7. Clear all stashes

    **git stash clear**

## Delete
1. Delete a file

    **rm -rf**

    -r => recursively
    
    -f => forcefully

    rm -rf {filename}